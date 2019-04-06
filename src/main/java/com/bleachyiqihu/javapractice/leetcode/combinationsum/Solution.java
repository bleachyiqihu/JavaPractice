package com.bleachyiqihu.javapractice.leetcode.combinationsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Paul on 2019-04-06
 */
public class Solution {
    List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum(candidates, target, candidates.length);
    }

    private List<List<Integer>> combinationSum(int[] candidates, int target, int length) {
        if (candidates == null || length == 0 || candidates[0] > target) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new LinkedList<>();
        for (int i = length - 1; i >= 0; i--) {
            if (candidates[i] > target) {
                continue;
            }
            if (candidates[i] == target) {
                List<Integer> list = new LinkedList<>();
                list.add(candidates[i]);
                result.add(list);
                continue;
            }
            int count = 1;
            int temp = candidates[i];
            while (temp <= target) {
                if (temp == target) {
                    List<Integer> tempRes = new LinkedList<>();
                    for (int j = 0; j < count; j++) {
                        tempRes.add(candidates[i]);
                    }
                    result.add(tempRes);
                } else {
                    List<List<Integer>> recurRes = combinationSum(candidates, target - temp, i);
                    if (recurRes != null && !recurRes.isEmpty()) {
                        for (List<Integer> resList : recurRes) {
                            for (int j = 0; j < count; j++) {
                                resList.add(candidates[i]);
                            }
                            result.add(resList);
                        }
                    }
                }
                temp += candidates[i];
                count++;
            }

        }
        return result;
    }
}
