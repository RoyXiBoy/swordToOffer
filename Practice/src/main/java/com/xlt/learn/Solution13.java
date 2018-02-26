package com.xlt.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xlt on 20180211.
 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution13 {
   public void reOrderArray(int[] array){
       List jList = new ArrayList();
       List oList = new ArrayList();

       for (int a : array){
           if(a % 2 == 0){
               oList.add(a);
           }else {
               jList.add(a);
           }
       }

       jList.addAll(oList);
       for (int i = 0 ; i<array.length; i++){
           array[i] = (int)jList.get(i);
       }
   }

   //还有一种不借助辅助空间，遍历i 为奇数时候，从j（j=i）遍历，为偶数时，将偶数插到奇数前面。

    //还有类似冒泡排序，i为偶 i-1 为奇 则交换位置。 时间复杂度都很高。


    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        int[] array = {1, 2, 3, 4,  5, 6, 7, 8, 9};
        solution.reOrderArray(array);
        for(int a : array){
            System.out.print(a+" ");
        }
    }

}
