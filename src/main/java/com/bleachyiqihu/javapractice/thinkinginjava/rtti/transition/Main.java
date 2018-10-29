package com.bleachyiqihu.javapractice.thinkinginjava.rtti.transition;

/**
 * Created by Paul on 2017-08-23
 */
public class Main {

    public static void main(String[] args) {
        Object c = new B();
        System.out.println(c.getClass());
        C c2 = (C)c;
        c2.cFunc();

    }
}
