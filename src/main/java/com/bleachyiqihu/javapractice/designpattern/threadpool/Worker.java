package com.bleachyiqihu.javapractice.designpattern.threadpool;

public class Worker implements Runnable {

    private final Task task;

    Worker(final Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "," + task.toString());
        try {
            Thread.sleep(task.getTimeMs());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
