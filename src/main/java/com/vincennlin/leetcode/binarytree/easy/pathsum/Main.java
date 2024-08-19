package com.vincennlin.leetcode.binarytree.easy.pathsum;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 建立二叉樹 root = [5,4,8,11,null,13,4,7,2,null,null,null,1]
        Solution.TreeNode root = new Solution.TreeNode(5);
        root.left = new Solution.TreeNode(4);
        root.right = new Solution.TreeNode(8);
        root.left.left = new Solution.TreeNode(11);
        root.left.left.left = new Solution.TreeNode(7);
        root.left.left.right = new Solution.TreeNode(2);
        root.right.left = new Solution.TreeNode(13);
        root.right.right = new Solution.TreeNode(4);
        root.right.right.right = new Solution.TreeNode(1);

        int targetSum = 22;

        // 檢查是否存在根到葉子的路徑，其路徑和等於 targetSum
        System.out.println(solution.hasPathSum(root, targetSum)); // 應該輸出 true
    }
}

