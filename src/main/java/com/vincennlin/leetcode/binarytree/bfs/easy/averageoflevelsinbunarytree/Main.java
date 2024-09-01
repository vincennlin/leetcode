package com.vincennlin.leetcode.binarytree.bfs.easy.averageoflevelsinbunarytree;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println(solution.averageOfLevels(root1));
        // 應該輸出 [3.00000, 14.50000, 11.00000]

        // Example 2: root = [3,9,20,15,7]
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        System.out.println(solution.averageOfLevels(root2));
        // 應該輸出 [3.00000, 14.50000, 11.00000]
    }
}

