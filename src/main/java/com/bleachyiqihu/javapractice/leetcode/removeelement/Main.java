package com.bleachyiqihu.javapractice.leetcode.removeelement;

/**
 * @Author wuguan
 * @Date 2019/2/25 21:30
 **/
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeElement(new int[]{1,2,3,4,4,5}, 4));
        System.out.println(solution.removeElement(new int[]{1,2,3,4,4,5}, 1));
    }
}
