package com.bleachyiqihu.javapractice.designpattern.builder;

import com.bleachyiqihu.javapractice.designpattern.builder.normal.Instance;

/**
 * @Author wuguan
 * @Date 2019/7/14 10:58
 **/
public class Main {
    public static void main(String[] args) {
        Instance instance = new Instance.Builder().attr1("a").attr2("b").build();

    }
}
