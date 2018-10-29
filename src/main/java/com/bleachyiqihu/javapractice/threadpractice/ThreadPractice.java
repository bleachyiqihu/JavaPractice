package com.bleachyiqihu.javapractice.threadpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Paul on 2017-11-13
 */

class HelloThread extends Thread {

    String name;

    public HelloThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + name + "!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Goodbye, " + name + "!");
    }
}


public class ThreadPractice {
    public static void main(String[] args) throws Exception {
        List<Thread> threads = new ArrayList<>();
        for (String name : Arrays.asList("Bob", "Alice", "Tom")) {
            threads.add(new HelloThread(name));
        }
        System.out.println("START");
        for (Thread t : threads) {
            t.start();
        }
        for(Thread t: threads) {
            t.join();
        }
        System.out.println("END");
    }
}
