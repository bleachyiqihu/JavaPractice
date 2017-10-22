package com.bleachyiqihu.javapractice.generic.generator;

/**
 * 一个可以记录自己创建了多少个对象的类
 *
 * Created by Paul on 2017/10/21
 */
public class CountObject {
    private static int count = 0;
    private final int myCount = count++;

    @Override
    public String toString() {
        return "CountObject{" +
                "myCount=" + myCount +
                '}';
    }
}
