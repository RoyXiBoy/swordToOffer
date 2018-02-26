package com.xlt.learn;
import java.util.ArrayList;

/**
 * Created by xlt on 20180211.

 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

 这道题只是检查 数组是否符合 二叉搜索树（左子树<根节点<右子树） 的后序遍历结果（最后一个是根节点。）
 */


public class Solution23 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }

        if(sequence.length == 1){
            return true;
        }
        int start = 0;
        int rootIndex = sequence.length-1;
        return judge(sequence, start, rootIndex);

    }

    public static boolean judge(int[] sequence, int start, int rootIndex){
        if (start >= rootIndex){
            return true;
        }

        int j = rootIndex-1;
        while (j > start && sequence[j] > sequence[rootIndex]){
            j--;
        }

        for (int i = start; i < j; i++) {
            if(sequence[i] > sequence[rootIndex]){
                return false;
            }
        }

        return judge(sequence, start, j-1) && judge(sequence, j, rootIndex-1);
    }

    public static void main(String[] args) {

    }
}
