package com.bleachyiqihu.javapractice.metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

import java.util.concurrent.TimeUnit;

/**
 * @Author wuguan
 * @Date 2019/5/28 20:33
 **/
public class MeterTest {


    private static void request(Meter meter) {
        System.out.println("request");
        meter.mark();
    }


    private static void request(Meter meter, int n) {
        while (n > 0) {
            request(meter);
            n--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MetricRegistry metricRegistry = new MetricRegistry();
        ConsoleReporter consoleReporter = ConsoleReporter.forRegistry(metricRegistry).build();
        consoleReporter.start(1, TimeUnit.SECONDS);
        Meter meter = metricRegistry.meter(MetricRegistry.name(MeterTest.class, "request", "tps"));
        while (true) {
            request(meter, 5);
            Thread.sleep(1000);
        }
    }
}
