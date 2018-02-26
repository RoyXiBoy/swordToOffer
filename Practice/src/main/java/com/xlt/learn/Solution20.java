package com.xlt.learn;
import java.util.Stack;

/**
 * Created by xlt on 20180211.
 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */


public class Solution20 {

    private Stack stack = new Stack<Integer>();

    //辅助栈不能只保留最小值，应当是栈顶保持最小值，而栈大小与原栈相同。
    private Stack min = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        if(min.empty()){
            min.push(node);
        }else {
            int m = (int)min.pop();
            if(node < m){
                min.push(m);
                min.push(node);
            }else {
                min.push(m);
                min.push(m);
            }
        }

    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        int result = (int)stack.pop();
        stack.push(result);
        return result;
    }
//数据量大的时候会慢。比较好的做法是 在进栈前就把最小值找出来。
    public int min() {
        int result = (int)min.pop();
        min.push(result);
        return result;
    }
   /* public int min() {
        Stack stack2 = new Stack<Integer>();
        int result = (int)stack.pop();
        stack2.push(result);
        while (!stack.empty()){
            int temp = (int)stack.pop();
            stack2.push(temp);
            if(result > temp){
                result = temp;
            }
        }
        while (!stack2.empty()){
            stack.push(stack2.pop());
        }
        return result;
    }*/

    public static void main(String[] args) {

    }
}
