package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution12 {
    public double Power(double base , int n){
        double result = 1;
        if(n > 0){
            for (int i = 0; i < n ;i++) {
                result *= base;
            }
        }else if(n == 0){
            result = result;
        }else if(n < 0){
            if(base == 0){
                throw new ArithmeticException();
            }else {
                n = -n;
                for (int i = 0; i < n ;i++) {
                    result *= base;
                }
                result  = 1/result;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        System.out.println(solution.Power(3.1,2));

    }

}
