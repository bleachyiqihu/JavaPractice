package com.bleachyiqihu.javapractice.leetcode.mergeksortedlists;

/**
 * Created by Paul on 2018-10-17
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode[] lists = new Solution.ListNode[3];
        Solution.ListNode listNode1 = new Solution.ListNode(1);
        Solution.ListNode listNode2 = new Solution.ListNode(2);
        Solution.ListNode listNode3 = new Solution.ListNode(3);
        lists[0] = listNode1;
        lists[1] = listNode2;
        lists[2] = listNode3;
        System.out.println(solution.mergeKLists(lists));
    }
}
