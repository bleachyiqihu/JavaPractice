package com.bleachyiqihu.javapractice.algorithm.dp;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Paul on 2018-12-26
 */
public class Main {
    public static void main(String[] args) {
        Package p = new Package(10);
        List<Integer> goodsWeightList = Arrays.asList(9, 5, 1);
        System.out.println(p.maxWeight(goodsWeightList));
        System.out.println(p.dpMaxWeight(goodsWeightList));
    }
}
