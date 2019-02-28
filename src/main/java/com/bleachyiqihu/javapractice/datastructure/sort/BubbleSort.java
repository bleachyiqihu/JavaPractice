package com.bleachyiqihu.javapractice.datastructure.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Paul on 2018-11-26
 */
public class BubbleSort {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new LinkedList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = in.readLine()) != null && !"".equals(s)) {
                list.add(Integer.valueOf(s));
        }
        in.close();

        bubbleSort(list);

        System.out.println(list);

    }

    private static void bubbleSort(List<Integer> list) {
        int temp;
        for(int i = 0; i < list.size(); i ++) {
            for(int j = 0 ; j < list.size() - i - 1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}
