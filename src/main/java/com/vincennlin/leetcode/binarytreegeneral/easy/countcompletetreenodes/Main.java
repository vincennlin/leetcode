package com.vincennlin.leetcode.binarytreegeneral.easy.countcompletetreenodes;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [1,2,3,4,5,6]
        Solution.TreeNode root1 = new Solution.TreeNode(1);
        root1.left = new Solution.TreeNode(2);
        root1.right = new Solution.TreeNode(3);
        root1.left.left = new Solution.TreeNode(4);
        root1.left.right = new Solution.TreeNode(5);
        root1.right.left = new Solution.TreeNode(6);

        System.out.println(solution.countNodes(root1)); // 應該輸出 6

        // Example 2: root = []
        Solution.TreeNode root2 = null;

        System.out.println(solution.countNodes(root2)); // 應該輸出 0

        // Example 3: root = [1]
        Solution.TreeNode root3 = new Solution.TreeNode(1);

        System.out.println(solution.countNodes(root3)); // 應該輸出 1
    }
}
