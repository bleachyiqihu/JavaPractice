package com.bleachyiqihu.javapractice.designpattern.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program start");

        List<Task> tasks = new ArrayList<>();
        tasks.add(new CodingTask(2));
        tasks.add(new CoffeeTask(3));
        tasks.add(new CodingTask(5));
        tasks.add(new CoffeeTask(1));
        tasks.add(new CoffeeTask(8));

        // 用Executors的工厂，实例化了一个线程池，这个线程池中有固定的三个线程
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(Task task: tasks) {
            Runnable worker = new Worker(task);
            executor.submit(worker);
        }
        // 没有其他的任务要提交了，可以执行shutdown方法，使得executor不能再接受其他的任务
        executor.shutdown();

        while(!executor.isTerminated()) {
            // 主线程暗示jvm，自己愿意让出cpu，进入ready队列等待重新调度。目的在于让worker线程尽快使用cpu完成任务
            Thread.yield();
        }

        System.out.println("Program finished");
    }
}
