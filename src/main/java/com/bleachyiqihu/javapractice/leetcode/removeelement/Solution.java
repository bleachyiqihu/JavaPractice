package com.bleachyiqihu.javapractice.leetcode.removeelement;

/**
 * @Author wuguan
 * @Date 2019/2/25 21:30
 **/
public class Solution {
    int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int tail = nums.length-1;
        int temp;
        for(int i=0;i <= tail;i++) {
            if(nums[i] == val) {
                while(nums[tail] == val && tail > i) {
                    tail -= 1;
                }
                if(tail != i) {
                    temp = nums[i];
                    nums[i] = nums[tail];
                    nums[tail] = temp;
                }
            }
        }
        return tail;
    }
}
