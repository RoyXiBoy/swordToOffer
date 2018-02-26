package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 *输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution11 {

    public int NumberOf1(int n) {
        return  Integer.bitCount(n);
    }

    public int NumberOf11(int n) {
        int count =0;
        for (int i =0 ; i<Integer.SIZE;i++){
            if (1 == (n>>i & 1)){
                count++;
            }
        }
        return count;
    }

    public int NumberOf111(int n) {
        int count =0;
        for (;n!=0;count++){
            n= n&(n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        int n = 56;
        System.out.println(solution.NumberOf11(n));
        System.out.println(solution.NumberOf1(n));
        System.out.println(solution.NumberOf111(n));

    }

}
