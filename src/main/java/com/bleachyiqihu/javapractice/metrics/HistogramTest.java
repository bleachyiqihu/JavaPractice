package com.bleachyiqihu.javapractice.metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.ExponentiallyDecayingReservoir;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.MetricRegistry;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Author wuguan
 * @Date 2019/5/28 20:41
 **/
public class HistogramTest {

    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        MetricRegistry metricRegistry = new MetricRegistry();
        ConsoleReporter consoleReporter = ConsoleReporter.forRegistry(metricRegistry).build();
        consoleReporter.start(1, TimeUnit.SECONDS);
        Histogram histogram = new Histogram(new ExponentiallyDecayingReservoir());
        metricRegistry.register(MetricRegistry.name(HistogramTest.class, "request", "histogram"), histogram);
        while (true) {
            int i = random.nextInt(100000);
            System.out.println(i);
            histogram.update(i);
            Thread.sleep(1000);
        }
    }
}
