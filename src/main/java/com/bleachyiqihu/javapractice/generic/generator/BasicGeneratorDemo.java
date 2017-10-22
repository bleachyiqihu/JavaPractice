package com.bleachyiqihu.javapractice.generic.generator;

/**
 * Created by Paul on 2017/10/21
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        BasicGenerator<CountObject> basicGenerator = BasicGenerator.create(CountObject.class);
        for (int i = 0; i < 8; i++) {
            System.out.println(basicGenerator.next());
        }
    }
}
