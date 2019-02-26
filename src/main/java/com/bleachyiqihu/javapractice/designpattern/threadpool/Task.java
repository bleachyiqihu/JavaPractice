package com.bleachyiqihu.javapractice.designpattern.threadpool;

import java.util.concurrent.atomic.AtomicInteger;

abstract class Task {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private final int timeMs;

    Task(int timeMs) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.timeMs = timeMs;
    }

    int getTimeMs() {
        return this.timeMs;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", timeMs=" + timeMs +
                '}';
    }
}
