package com.xlt.learn;
import java.util.ArrayList;

/**
 * Created by xlt on 20180211.

 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */


public class Solution22 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<TreeNode> treeNodeList = new ArrayList<TreeNode>();

        if(root == null){
            return arrayList;
        }

        treeNodeList.add(root);
        while (!treeNodeList.isEmpty()){
            //删除最前面 并获取最前面
            TreeNode temp = treeNodeList.remove(0);

            if(temp.left != null){
                treeNodeList.add(temp.left);
            }

            if(temp.right != null){
                treeNodeList.add(temp.right);
            }

            arrayList.add(temp.val);
        }
        return arrayList;
    }

    public static void main(String[] args) {

    }
}
