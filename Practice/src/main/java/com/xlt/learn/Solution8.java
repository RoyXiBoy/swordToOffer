package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution8 {

    //跳到n格代价的方法 = 跳到 n-1 格的方法数 + 跳到 n-2 格的方法数
    public int JumpFloor(int target) {
        if(target > 0){
            if(target == 1 || target == 2){
                return target;
            }
            if(target > 2){
                int fn2 = 1;
                int fn1 = 2;
                int fn = 0;

                while (target-- >2){
                    fn = fn2 + fn1;
                    fn2 = fn1;
                    fn1 = fn;
                }
                return fn;
            }

        }
        return 0;
    }


    public static void main(String[] args) {


    }

}
