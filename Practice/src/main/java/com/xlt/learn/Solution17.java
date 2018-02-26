package com.xlt.learn;

/**
 * Created by xlt on 20180211.

 */


public class Solution17 {

    public static class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public boolean hasSubTree(TreeNode treeNode1, TreeNode treeNode2){
        if(treeNode2 == null){
            return false;
        }
        return help(treeNode1, treeNode2);
    }

    public static boolean help(TreeNode treeNode1, TreeNode treeNode2){
        if (treeNode2 == null){
            return true;
        }
        if(treeNode1 == null){
            return false;
        }

        if(treeNode1.val == treeNode2.val){
            if(help(treeNode1.left, treeNode2.left) && help(treeNode1.right, treeNode2.right)){
                return true;
            }
        }

        return help(treeNode1.left, treeNode2.left) || help(treeNode1.right, treeNode2.right);
    }

    public static void main(String[] args) {
        Solution17 solution = new Solution17();


    }
}
