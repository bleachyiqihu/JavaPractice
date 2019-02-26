package com.bleachyiqihu.javapractice.leetcode.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        if (n < 1) {
            return resultList;
        }
        char[] levelArr = new char[n * 2];
        levelArr[0] = '(';
        recur(levelArr, 1, 1, n, 1, resultList);
        return resultList;
    }

    private void recur(char[] levelArr, int usedLeftCount, int unmatchedLeftCount, int n, int pos, List<String> resultList) {
        if(pos == n * 2) {
            resultList.add(String.valueOf(levelArr));
            return;
        }
        if(usedLeftCount < n) {
            levelArr[pos] = '(';
            recur(levelArr, usedLeftCount+1, unmatchedLeftCount+1, n, pos+1, resultList);
        }

        if(unmatchedLeftCount > 0) {
            levelArr[pos] = ')';
            recur(levelArr, usedLeftCount, unmatchedLeftCount-1, n, pos+1, resultList);
        }
    }
}
