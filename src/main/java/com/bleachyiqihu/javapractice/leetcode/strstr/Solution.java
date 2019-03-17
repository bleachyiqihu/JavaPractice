package com.bleachyiqihu.javapractice.leetcode.strstr;

/**
 * Created by Paul on 2019-03-14
 */
public class Solution {
     int strStr(String haystack, String needle) {
        if(needle.equals("")) {
            return 0;
        }
        int i = 0;
        while(i < haystack.length()) {
            while(i < haystack.length()) {
                if(haystack.charAt(i) != needle.charAt(0)) {
                    i++;
                } else {
                    if(haystack.length() - i < needle.length()) {
                        return -1;
                    }
                    String subString = haystack.substring(i, i+needle.length());
                    if(subString.equals(needle)) {
                        return i;
                    } else {
                        i++;
                    }
                }
            }
        }
        return -1;
    }
}
