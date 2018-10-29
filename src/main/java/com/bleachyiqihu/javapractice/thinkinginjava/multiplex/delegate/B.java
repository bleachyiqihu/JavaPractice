package com.bleachyiqihu.javapractice.thinkinginjava.multiplex.delegate;

/**
 *
 * Created by Paul on 2017/6/19.
 */
public class B {
    private A a;

    public void f1() {
        a.f1();
    }

    public void f2() {
        a.f2();
    }
}
