package com.vincennlin.leetcode.binarytreegeneral.easy.maximumdepthofbinarytree;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(9);
        root.right = new Solution.TreeNode(20);
        root.right.left = new Solution.TreeNode(15);
        root.right.right = new Solution.TreeNode(7);

        System.out.println(solution.maxDepth(root));
    }
}
