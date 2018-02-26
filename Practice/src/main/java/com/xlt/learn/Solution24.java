package com.xlt.learn;

import java.util.ArrayList;

/**
 * Created by xlt on 20180211.

 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */


public class Solution24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    ArrayList<ArrayList<Integer>> paths = new  ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> path = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return paths;
        }

        target -= root.val;
        path.add(root.val);

        if(target == 0 && root.left == null && root.right == null){
            paths.add(new ArrayList<Integer>(path));
        }

        FindPath(root.left, target);

        FindPath(root.right, target);

        path.remove(path.size()-1);

        return paths;

    }



    public static void main(String[] args) {

    }
}
