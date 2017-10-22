package com.bleachyiqihu.javapractice.generic.erase;

import java.util.Arrays;

/**
 * Created by Paul on 2017/10/22
 */
public class Erase<T> {
    public static void main(String[] args) {
        Erase<String> erase = new Erase<>();
        System.out.println(Arrays.toString(erase.getClass().getTypeParameters()));
    }
}
