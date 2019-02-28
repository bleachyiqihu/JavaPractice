package com.bleachyiqihu.javapractice.multithread.c1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Paul on 2019-02-26
 */
public class UnsafeThread extends Thread {

    private UnsafeGetId unsafeGetId;
    private static final String PREFIX = "UNSAFE-THREAD-";
    private static final AtomicInteger ID_GEN = new AtomicInteger();

    UnsafeThread(UnsafeGetId unsafeGetId) {
        this.unsafeGetId = unsafeGetId;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(PREFIX + ID_GEN.incrementAndGet());
        int id = 0;
        try {
            id = unsafeGetId.getId();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": " + id);
    }
}
