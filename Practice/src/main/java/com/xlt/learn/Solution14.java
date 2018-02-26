package com.xlt.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlt on 20180211.

 */


public class Solution14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode findKthFromTail(ListNode head, int k){
        if(head == null || k < 0){
            return null;
        }

        ListNode listNode1 = head;
        ListNode listNode2 = head;

        for (int i = 0; i < k; i++){
            listNode1 = listNode1.next;
        }

        if (listNode1 == null){
            return null;
        }

        while (listNode1.next != null){
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }

        return listNode2;
    }


    public static void main(String[] args) {
        Solution14 solution = new Solution14();


    }
}
