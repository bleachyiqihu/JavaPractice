package com.bleachyiqihu.javapractice.multithread.c1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Paul on 2019-02-26
 */
public class TestRaceCondition {
    public static void main(String[] args) throws InterruptedException {

        List<Thread> unsafeThreadList = new LinkedList<>();

        UnsafeGetId unsafeGetId = new UnsafeGetId(0);
        for(int i=0;i < 10;i++) {
            Thread thread = new UnsafeThread(unsafeGetId);
            thread.start();
            unsafeThreadList.add(thread);
        }

        for(Thread thread: unsafeThreadList) {
            thread.join();
        }

        System.out.println("======================================");

        SafeGetId safeGetId = new SafeGetId(0);
        for(int i=0;i < 10;i++) {
            Thread thread = new SafeThread(safeGetId);
            thread.start();
        }
    }
}
