package com.bleachyiqihu.javapractice.leetcode.threesum;

import java.util.*;

/**
 * Created by Paul on 2019-01-16
 */
class Solution2 {
    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            List<List<Integer>> twoSum = twoSum(nums, i - 1, 0 - nums[i]);
            for (List<Integer> rst : twoSum) {
                rst.add(nums[i]);
                result.add(rst);
            }
        }
        return result;
    }


    private List<List<Integer>> twoSum(int[] nums, int end, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= end; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> rst = new LinkedList<>();
                rst.add(nums[map.get(nums[i])]);
                rst.add(nums[i]);
                if (!result.contains(rst))
                    result.add(rst);
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

}
