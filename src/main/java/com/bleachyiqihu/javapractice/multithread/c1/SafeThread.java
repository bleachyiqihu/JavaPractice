package com.bleachyiqihu.javapractice.multithread.c1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Paul on 2019-02-26
 */
public class SafeThread extends Thread {

    private SafeGetId safeGetId;
    private static final String PREFIX = "SAFE-THREAD-";
    private static final AtomicInteger idGen = new AtomicInteger();

     SafeThread(SafeGetId safeGetId) {
        this.safeGetId = safeGetId;
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().setName(PREFIX + idGen.incrementAndGet());
            System.out.println(Thread.currentThread().getName() + ": " + safeGetId.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
