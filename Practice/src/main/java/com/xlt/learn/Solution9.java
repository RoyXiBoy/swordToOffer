package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution9 {

    /**fn =1+ f(n-1)+f(n-2)+...+f(1)
    f(n-1) =1+ f(n-2)+...+f(1)
    fn = 2f(n-1)
    fn/f(n-1) = 2
    所以fn = 2^(n-1)
     **/
    public int JumpFloorII(int target) {
        return 1<<--target;
    }



    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        System.out.println(solution.JumpFloorII(7));

    }

}
