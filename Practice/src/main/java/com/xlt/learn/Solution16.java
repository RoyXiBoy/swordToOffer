package com.xlt.learn;

/**
 * Created by xlt on 20180211.

 */


public class Solution16 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode Merge(ListNode listNode1, ListNode listNode2){
        if(listNode1 == null || listNode2 == null){
            return null;
        }

        ListNode current = null;

        if(listNode1.val >= listNode2.val || listNode1 == null){
            current = new ListNode(listNode2.val);
            listNode2 = listNode2.next;
        }

        if(listNode1.val < listNode2.val || listNode2 == null){
            current = new ListNode(listNode1.val);
            listNode1 = listNode1.next;
        }

        ListNode head = current;

        while (listNode1 != null || listNode2 != null) {
            if(listNode1 == null && listNode2 == null){
                break;
            }

            if ( listNode1 == null || listNode1.val >= listNode2.val ) {
                current.next = new ListNode(listNode2.val);
                current = current.next;
                listNode2 = listNode2.next;
            }

            if(listNode1 == null && listNode2 == null){
                break;
            }

            if ( listNode2 == null || listNode1.val < listNode2.val ) {
                current.next = new ListNode(listNode1.val);
                current = current.next;
                listNode1 = listNode1.next;
            }
        }

        return head;
    }

    public ListNode merge(ListNode listNode1, ListNode listNode2){
        if (listNode1 == null){
            return listNode2;
        }

        if (listNode2 == null){
            return listNode1;
        }

        if (listNode1.val <= listNode2.val){
            listNode1.next = merge(listNode1.next,listNode2);
            return listNode1;
        }else {
            listNode2.next = merge(listNode1, listNode2.next);
            return listNode2;
        }
    }

    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        ListNode listNode1 = new  ListNode(1);
        ListNode listNode2 = new  ListNode(2);
        ListNode listNode3 = new  ListNode(3);

        ListNode listNode4 = new  ListNode(4);
        ListNode listNode5 = new  ListNode(5);
        ListNode listNode6 = new  ListNode(6);

        listNode1.next = listNode3;
        listNode3.next = listNode5;

        listNode2.next = listNode4;
        listNode4.next = listNode6;

        ListNode l = solution.merge(listNode1,listNode2);
        while (l != null){
            System.out.println(
                    l.val
            );
            l = l.next;
        }



    }
}
