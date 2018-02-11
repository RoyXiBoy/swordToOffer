package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 */
public class Solution1 {
    public static boolean Find(int target, int [][] array) {

        int row = 0;
        int col = array.length-1;


        for(; row < array[0].length || col >= 0; ){
            if(target > array[col][row]){
                row++;
            }
            if(target < array[col][row]){
                col--;
            }
            if(target == array[col][row]){
                return true;
            }
        }

        return false;
    }

    public static Boolean findArray2(int[][] array,int target) {

        int col = 0;


        for( ;col < array[col].length; col++){
            int start = 1;
            int end =  array[col].length;
            int mid = (start + end) / 2;
            while(start < end){
                if(target > array[col][mid]){
                    start = mid + 1;
                }
                if(target < array[col][mid]){
                    end = mid - 1;
                }
                if(target == array[col][mid]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2}, {4,5}, {7,8}};

        //时间复杂度 n^2
        System.out.println(Find(5,array));

        //时间复杂度 nlogn
        System.out.println(findArray2(array,6));
    }
}
