package com.bleachyiqihu.javapractice.leetcode.mergetwosortedlist;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode l1 = new Solution.ListNode(1);
        l1.next = new Solution.ListNode(2);
        l1.next.next = new Solution.ListNode(5);
        Solution.ListNode l2 = new Solution.ListNode(2);
        l2.next = new Solution.ListNode(4);
        l2.next.next = new Solution.ListNode(7);
        System.out.println(solution.mergeTwoLists(l1, l2));
    }
}
