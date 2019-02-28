package com.bleachyiqihu.javapractice.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Paul on 2019-01-16
 */
class Solution1 {
    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for(int i = 2; i <= nums.length - 1; i++) {
            if(i + 1 <= nums.length - 1 && nums[i+1] == nums[i])
                continue;
            int start = 0;
            int end = i-1;
            while(start < end) {
                if(nums[start] + nums[end] + nums[i] == 0) {
                    result.add(Arrays.asList(nums[start], nums[end], nums[i]));
                    start++;
                    if(start < end && nums[start-1] == nums[start])
                        start++;
                } else if(nums[start] + nums[end] + nums[i] > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }
}
