package com.bleachyiqihu.javapractice.metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * @Author wuguan
 * @Date 2019/5/28 12:23
 **/
public class GaugeTest {

    private static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException {
        MetricRegistry metricRegistry = new MetricRegistry();
        ConsoleReporter consoleReporter = ConsoleReporter.forRegistry(metricRegistry).build();
        metricRegistry.register(MetricRegistry.name(Queue.class, "queue", "size"), (Gauge<Integer>) () -> queue.size());
        consoleReporter.start(1, TimeUnit.SECONDS);
        while (true) {
            Thread.sleep(1000);
            queue.add("job");
        }
    }
}
