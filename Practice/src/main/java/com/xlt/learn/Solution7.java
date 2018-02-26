package com.xlt.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlt on 20180211.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 n<=39
 */
public class Solution7 {

    public int Fibonacci(int n) {
        if(n>39){
            return 0;
        }

        if(n==1||n==2){
            return 1;
        }

        //f(n-2)
        int fn2 = 1;
        //f(n-1)
        int fn1 = 1;
        int fn = 0;
        if(n>2){
            while (n-- >2){
               fn = fn2 + fn1;
                fn2 = fn1;
                fn1 =fn ;
            }
            return fn;
        }
        return 0;
    }

    public static void main(String[] args) {

    }

}
