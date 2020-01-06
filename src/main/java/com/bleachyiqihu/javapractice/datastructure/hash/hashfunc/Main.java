package com.bleachyiqihu.javapractice.datastructure.hash.hashfunc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul on 2018-10-27
 */
public class Main {
    public static void main(String[] args) {
        StringHashingFunc stringHashingFunc = new StringHashingFunc();
        System.out.println(stringHashingFunc.hashing("a", 5));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5, 5);
    }
}
