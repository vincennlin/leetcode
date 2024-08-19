package com.vincennlin.leetcode.binarytreegeneral.easy.symetrictree;
//101
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(2);
        root.left.left = null;
        root.left.right = new Solution.TreeNode(3);
        root.right.left = new Solution.TreeNode(3);

        System.out.println(solution.isSymmetric(root));
    }
}
