package com.bleachyiqihu.javapractice.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wuguan
 * @Date 2019/5/28 17:10
 **/
public class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = l1;

        l1.add("a");

        System.out.println(l1);
        System.out.println(l2);

        l2 = new ArrayList<>();

        System.out.println(l1);
        System.out.println(l2);

    }
}
