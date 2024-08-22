package com.vincennlin.leetcode.binarytreegeneral.easy.countcompletetreenodes;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [1,2,3,4,5,6]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);

        System.out.println(solution.countNodes(root1)); // 應該輸出 6

        // Example 2: root = []
        TreeNode root2 = null;

        System.out.println(solution.countNodes(root2)); // 應該輸出 0

        // Example 3: root = [1]
        TreeNode root3 = new TreeNode(1);

        System.out.println(solution.countNodes(root3)); // 應該輸出 1
    }
}
