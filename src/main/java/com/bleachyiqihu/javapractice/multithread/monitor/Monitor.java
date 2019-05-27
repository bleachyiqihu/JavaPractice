package com.bleachyiqihu.javapractice.multithread.monitor;

/**
 * @Author wuguan
 * @Date 2019/5/26 23:12
 **/
class Monitor {

    private static final int N = 10;

    private int[] buffer = new int[N];

    private int count = 0, hi = 0, lo = 0;    // 队列中的实体数量


    synchronized void insertItem(int item) {
        if (count >= N) {
            goToSleep();
        }
        buffer[hi] = item;
        hi = (hi + 1) % N;
        count += 1;
        if (count == 1) {
            notify();
        }
    }

    synchronized int removeItem() {
        int item;
        if (count == 0) {
            goToSleep();
        }
        item = buffer[lo];
        lo = (lo + 1) % N;
        count -= 1;
        if (count == N - 1) {
            notify();
        }
        return item;
    }

    private void goToSleep() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
