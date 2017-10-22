package com.bleachyiqihu.javapractice.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 无泛型时可能发生的错误
 *
 * Created by Paul on 2017/10/22
 */
public class NoGeneric {
    // 希望这个List存放String
    private static List myList = new ArrayList();
    private static List<String> gList = new ArrayList<>();

    private static class A {

    }

    public static void main(String[] args) {
        myList.add("abc");
        // 加入一个不是String的类型，运行时会得到Exception in thread "main" java.lang.ClassCastException
        myList.add(new A());
        for(int i = 0; i < myList.size(); i++) {
            String e = (String)myList.get(i);
            System.out.println(e.equals("abc"));
        }
//        gList.add(new A());  编译报错
    }

}
