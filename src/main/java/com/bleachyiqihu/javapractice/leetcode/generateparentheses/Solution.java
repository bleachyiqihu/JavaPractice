package com.bleachyiqihu.javapractice.leetcode.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        if (n < 1) {
            return resultList;
        }
        recur("(", 1, 1, n, resultList);
        return resultList;
    }

    private void recur(String levelStr, int usedLeftCount, int unmatchedLeftCount, int n, List<String> resultList) {
        if(levelStr.length() == n * 2) {
            resultList.add(levelStr);
            return;
        }
        if(usedLeftCount < n) {
            recur(levelStr + "(", usedLeftCount + 1, unmatchedLeftCount+1, n, resultList);
        }

        if(unmatchedLeftCount > 0) {
            recur(levelStr + ")", usedLeftCount, unmatchedLeftCount-1, n, resultList);
        }
    }
}
