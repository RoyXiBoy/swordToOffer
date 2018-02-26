package com.xlt.learn;

import java.util.Stack;

import static javafx.scene.input.KeyCode.T;
import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by xlt on 20180211.
 * 快排

 */
public class Solution6 {
    public void sort(int arr[],int low,int high)
    {
        int l = low;
        int h = high;
        int p = arr[low];

        while (l<h) {
            while (l < h && p <= arr[h]) {
                h--;
            }

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
            }

            while (l < h && p >= arr[l]) {
                l++;
            }

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
            }

            if (l > low) {
                sort(arr, low, l - 1);
            }
            if (h < high) {
                sort(arr, l + 1, high);
            }

        }
    }


    public static void main(String[] args) {
        int[] array = {8,9,4,6,3,2,5,1,10,7};
        Solution6 solution = new Solution6();
        solution.sort(array,0,array.length-1);
    }

}
