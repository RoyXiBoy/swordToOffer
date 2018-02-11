package com.xlt.learn;

import java.util.Stack;

/**
 * Created by xlt on 20180211.
 * 题目描述
 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        stack2.clear();
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }

        int result = stack2.pop();

        stack1.clear();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        solution.push(1);
        solution.push(2);
        solution.push(3);

        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());

    }
}
