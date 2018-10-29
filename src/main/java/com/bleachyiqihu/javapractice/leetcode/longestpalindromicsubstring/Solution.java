package com.bleachyiqihu.javapractice.leetcode.longestpalindromicsubstring;

/**
 * Created by Paul on 2018-10-23
 */
class Solution {
    String longestPalindrome(String s) {
        if("".equalsIgnoreCase(s) || s == null) {
            return "";
        }
        String maxStr = null;
        int maxLen = 0;
        boolean isPal[][] = new boolean[s.length()][s.length()];
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if(s.charAt(i) == s.charAt(j) && (j-i<=1 || isPal[i+1][j-1])) {
                    isPal[i][j] = true;
                    if(j-i+1 > maxLen) {
                        maxLen = j-i+1;
                        maxStr = s.substring(i, j + 1);
                    }
                }
            }
        }
        return maxStr;
    }
}
