package com.bleachyiqihu.javapractice.designpattern.singleton;

/**
 * Created by Paul on 2017-09-15
 */
public class Singleton {

    private static volatile Singleton uniqueSingleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueSingleton == null) {
            synchronized (Singleton.class) {
                if(uniqueSingleton == null) {
                    uniqueSingleton = new Singleton();
                }
            }
        }
        return uniqueSingleton;
    }

}
