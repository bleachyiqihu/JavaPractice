package com.bleachyiqihu.javapractice.datastructure.queue.blockqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author wuguan
 * @Date 2019/12/15 20:50
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> bq = new LinkedBlockingQueue<>(3);
        bq.add(1);
        bq.add(2);
        bq.add(3);
        new Thread(() -> {
            try {
                bq.put(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("put " + 4 + " into queue");
        }).start();
        Thread.sleep(3000);
        new Thread(() -> {
            Integer t = bq.poll();
            System.out.println("poll " + t + " 1st time");
        }).start();
        Thread.sleep(3000);
        new Thread(() -> {
            Integer t = bq.poll();
            System.out.println("poll " + t + " 2nd time");
        }).start();
//        Thread.sleep(3000);
        System.out.println("hold");
    }
}
