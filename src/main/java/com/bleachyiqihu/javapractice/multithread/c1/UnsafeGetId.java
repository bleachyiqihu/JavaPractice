package com.bleachyiqihu.javapractice.multithread.c1;


import com.bleachyiqihu.javapractice.multithread.annotation.NotThreadSafe;

@NotThreadSafe
class UnsafeGetId {
    private int id;

    UnsafeGetId(int id) {
        this.id = id;
    }

    int getId() throws InterruptedException {
        int temp = id;
        Thread.sleep(50);
        temp += 1;
        id = temp;
        return id;
    }
}
