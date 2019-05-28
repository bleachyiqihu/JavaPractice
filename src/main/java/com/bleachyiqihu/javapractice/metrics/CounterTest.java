package com.bleachyiqihu.javapractice.metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Counter;
import com.codahale.metrics.MetricRegistry;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @Author wuguan
 * @Date 2019/5/28 17:37
 **/
public class CounterTest {

    private static Queue<String> queue = new LinkedBlockingDeque<>();
    private static Counter counter;
    private static Random random = new Random();

    static void addJob(String jobName) {
        counter.inc();
        queue.offer(jobName);
    }

    static void removeJob() {
        counter.dec();
        queue.poll();
    }

    public static void main(String[] args) throws InterruptedException {
        MetricRegistry metricRegistry = new MetricRegistry();
        counter = metricRegistry.counter(MetricRegistry.name(Queue.class, "job", "size"));
        ConsoleReporter consoleReporter = ConsoleReporter.forRegistry(metricRegistry).build();
        consoleReporter.start(1, TimeUnit.SECONDS);
        int num = 0;
        while (true) {
            Thread.sleep(1000);
            if (random.nextDouble() > 0.7) {
                removeJob();
            } else {
                addJob("job" + num);
            }
            num++;
        }
    }
}
