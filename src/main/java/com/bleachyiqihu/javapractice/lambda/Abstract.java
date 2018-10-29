package com.bleachyiqihu.javapractice.lambda;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * lambda表达式用于行为参数化
 * Created by Administrator on 2017/3/29.
 */
public class Abstract {

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        return list.stream().filter(p::test).collect(toList());
    }

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple("red"));

        List<Apple> apples = filter(inventory, (Apple apple) -> "aaa".equals(apple.getColor()));

        apples.forEach(apple -> System.out.println(apple.toString()));

    }
}
