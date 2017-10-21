package com.bleachyiqihu.javapractice.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 没有泛型时的Java报错
 *
 * Created by Paul on 2017/10/21
 */
public class UncheckTypeError {
    private static List list = new ArrayList();

    private static class A {
        void say() {
            System.out.println("aaa");
        }
    }

    public static void main(String[] args) {
        list.add("aasda");
        list.add(new A());
        for(Object e:list) {
            ((A) e).say();
        }
    }
}
