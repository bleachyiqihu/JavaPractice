package com.bleachyiqihu.javapractice.leetcode.longestsubstring;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Paul on 2018-10-17
 */
class Solution {
     int lengthOfLongestSubstring(String s) {
         int maxLength = 0;
         int startPoint = 0;
         List<Character> subString = new LinkedList<>();
        for(int i=0; i < s.length();i++) {
            char cur = s.charAt(i);
            if(!subString.contains(cur)) {
                subString.add(cur);
            } else {
                maxLength = subString.size() > maxLength ? subString.size() : maxLength;
                int index = subString.indexOf(cur);
                startPoint += index + 1;
                // 循环结束后，i的值需要自增
                i = startPoint - 1;
                subString.clear();
            }
        }
         maxLength = subString.size() > maxLength ? subString.size() : maxLength;
        return maxLength;
    }
}
