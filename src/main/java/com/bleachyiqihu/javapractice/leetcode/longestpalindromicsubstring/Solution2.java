package com.bleachyiqihu.javapractice.leetcode.longestpalindromicsubstring;

/**
 * Created by Paul on 2018-10-23
 */
class Solution2 {

    private int maxLen = 0;
    private String maxStr;

    String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            findMax(s, i, i);
            findMax(s, i, i + 1);
        }
        return maxStr;
    }

    private void findMax(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        if (j - i - 1 > maxLen) {
            maxLen = j - i - 1;
            maxStr = s.substring(i + 1, j);
        }
    }

}
