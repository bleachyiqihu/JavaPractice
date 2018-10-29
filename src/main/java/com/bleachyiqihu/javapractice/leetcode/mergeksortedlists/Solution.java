package com.bleachyiqihu.javapractice.leetcode.mergeksortedlists;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Paul on 2018-10-17
 */
class Solution {

     static class ListNode {
        int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

     ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
         List<ListNode> listNodeList = Arrays.asList(lists);
         while(!listNodeList.stream().allMatch(Objects::isNull)) {
             List<ListNode> notNullList = listNodeList.stream().filter(Objects::nonNull).collect(Collectors.toList());
             ListNode minNode= new ListNode(notNullList.get(0).val);
             int minNodeIndex = 0;
             for(int i=1;i<notNullList.size();i++) {
                if(notNullList.get(i).val < minNode.val) {
                    minNode.val = notNullList.get(i).val;
                    minNodeIndex = i;
                }
             }
             notNullList.set(minNodeIndex, notNullList.get(minNodeIndex).next) ;
             if(result == null) {
                 result = minNode;
             } else {
                 result.next = minNode;
             }
         }
        return result;

    }
}
