package com.vincennlin.leetcode.binarytree.general.easy.symetrictree;
//101
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);

        System.out.println(solution.isSymmetric(root));
    }
}
