package com.bleachyiqihu.javapractice.multithread.monitor;

import com.bleachyiqihu.javapractice.thinkinginjava.rtti.transition.C;

import java.util.Random;

/**
 * @Author wuguan
 * @Date 2019/5/26 23:12
 **/
public class ProducerConsumer {

    private static Monitor monitor = new Monitor();

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Producer producer = new Producer();
        consumer.start();
        producer.start();
    }

    static class Consumer extends Thread {
        @Override
        public void run() {
            while (true) {
                int item = monitor.removeItem();
                System.out.println("consume " + item);
            }
        }
    }

    static class Producer extends Thread {

        @Override
        public void run() {
            while (true) {
                int item = produceItem();
                System.out.println("produce " + item);
                monitor.insertItem(item);
            }
        }

        private int produceItem() {
            return new Random().nextInt();
        }

    }
}
