package com.xlt.learn; /**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

import java.util.ArrayList;
import java.util.Stack;

public class Solution03 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){

        ArrayList newList = new ArrayList<Integer>();
        Stack stack = new Stack<Integer>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }


        while(!stack.isEmpty()){
            newList.add(stack.pop());
        }
        return newList;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        printListFromTailToHead(listNode1).forEach(System.out::print);
    }
}