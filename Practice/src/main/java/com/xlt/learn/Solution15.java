package com.xlt.learn;

/**
 * Created by xlt on 20180211.

 */


public class Solution15 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode reverseList(ListNode listNode){
        ListNode current = null;
        ListNode pre = null;


        while (listNode != null){
            current = listNode.next;
            listNode.next = pre;
            pre = listNode;

            if(current == null){
                break;
            }
            listNode = current;

        }

        return listNode;
    }

    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        ListNode listNode1 = new  ListNode(1);
        ListNode listNode2 = new  ListNode(2);
        ListNode listNode3 = new  ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode re = solution.reverseList(listNode1);
        while (re!=null){
            System.out.println(re.val);
            re = re.next;

        }

    }
}
