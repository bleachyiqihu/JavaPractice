package com.bleachyiqihu.javapractice.metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Author wuguan
 * @Date 2019/5/28 21:02
 **/
public class TimerTest {

    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        MetricRegistry metricRegistry = new MetricRegistry();
        ConsoleReporter consoleReporter = ConsoleReporter.forRegistry(metricRegistry).build();
        consoleReporter.start(1, TimeUnit.SECONDS);
        Timer timer = metricRegistry.timer(MetricRegistry.name(TimerTest.class));
        Timer.Context ctx;
        while(true) {
            ctx = timer.time();
            Thread.sleep(random.nextInt(1000));
            ctx.stop();
        }
    }
}
