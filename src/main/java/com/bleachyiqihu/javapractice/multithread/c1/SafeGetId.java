package com.bleachyiqihu.javapractice.multithread.c1;

import com.bleachyiqihu.javapractice.multithread.annotation.GuardedBy;
import com.bleachyiqihu.javapractice.multithread.annotation.ThreadSafe;

/**
 * Created by Paul on 2019-02-26
 */
@ThreadSafe
class SafeGetId {
    @GuardedBy("this")
    private int id;

    SafeGetId(int id) {
        this.id = id;
    }

    synchronized int getId() throws InterruptedException {
        int temp = id;
        Thread.sleep(50);
        temp += 1;
        id = temp;
        return id;
    }
}
