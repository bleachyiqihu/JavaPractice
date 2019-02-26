package com.bleachyiqihu.javapractice.leetcode.threesum;

/**
 * Created by Paul on 2019-01-16
 */
public class Main {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        System.out.println(solution1.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(solution2.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(solution2.threeSum(new int[]{-1, 0, 1}));
    }
}
