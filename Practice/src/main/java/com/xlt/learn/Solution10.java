package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Solution10 {

    //f1=1 f2=2 f3=3 f4=5 f5=8
    //和青蛙跳台阶思路一样fn = fn1 +fn2
    public int RectCover(int target) {
        int fn2 = 1;
        int fn1 = 2;
        int fn = 0;

        if(target <= 2){
            return target;
        }else {
            while (target-- >2){
                fn = fn1 + fn2;
                fn2 = fn1;
                fn1 = fn;
            }
            return fn;
        }


    }

    public static void main(String[] args) {


    }

}
