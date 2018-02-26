package com.xlt.learn;

/**
 * Created by xlt on 20180211.
 操作给定的二叉树，将其变换为源二叉树的镜像。
 */


public class Solution18 {
    public static class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode temp ;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }

    }

    public static void main(String[] args) {

    }
}
