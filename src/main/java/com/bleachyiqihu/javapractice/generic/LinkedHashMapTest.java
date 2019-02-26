package com.bleachyiqihu.javapractice.generic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put("A", "a");
        orderedMap.put("B", "b");
        System.out.println(orderedMap);
    }
}
