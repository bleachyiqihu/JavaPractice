package com.bleachyiqihu.javapractice.common;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author wuguan
 * @Date 2019/5/28 17:10
 **/
public class Main {


    public static class A {
        private String a;

        private String b;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }
    }

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        A a1 = new A();
        a1.setA("1");
        a1.setB("2");

        A a2 = new A();
        a2.setB("3");
        a2.setB("4");


        List<A> list = Arrays.asList(a1, a2);
        System.out.println(Arrays.toString(list.toArray()));

        List<Long> list1 = Arrays.asList(1L, 2L);
        System.out.println(Arrays.toString(list1.toArray()));

    }


}
