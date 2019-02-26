package com.bleachyiqihu.javapractice.leetcode.threesumclosest;

import java.util.Arrays;

class Solution {
    int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        long result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                long sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    return 0;
                }
                result = Math.abs(sum - target) < Math.abs(result - target) ? sum : result;
            }
        }
        return (int) result;
    }
}
