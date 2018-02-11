package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 * 题目描述
 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution4 {

      /*Definition for binary tree*/

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) { val = x; }
      }


      public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
            TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
            return root;
      }

      public TreeNode  reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
            if(startPre>endPre || startIn>endIn){
                return null;
            }
            TreeNode root = new TreeNode(pre[startPre]);
            for (int i = startIn; i<=endIn; i++){
                //前序遍历时 第一个为根节点。先找中序遍历
                if(in[i] == pre[startPre]){
                    //startPre+1 ：+1是把根节点排掉。
                    //startPre+i-startIn: +i 是左树长度
                    root.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn,i-1);
                    root.right = reConstructBinaryTree(pre, startPre+i-startIn+1, endPre, in, i+1,endIn);
                    break;
                }
            }
            return root;
      }



      public static void main(String[] args) {
            int[] pre = {1,2,4,9,10,7,3,5,6,8};
            int[] in = {9,10,4,7,2,1,5,3,8,6};
            Solution4 solution = new Solution4();
            TreeNode treeNode = solution.reConstructBinaryTree(pre,in);

      }
}
