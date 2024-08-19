package com.vincennlin.leetcode.binarysearchtree.easy.convertsortedarraytobinarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: nums = [-10, -3, 0, 5, 9]
        int[] nums1 = {-10, -3, 0, 5, 9};
        Solution.TreeNode root1 = solution.sortedArrayToBST(nums1);
        System.out.println(treeToList(root1)); // 輸出: [0, -10, 5, null, -3, null, 9]

        // Example 2: nums = [1, 3]
        int[] nums2 = {1, 3};
        Solution.TreeNode root2 = solution.sortedArrayToBST(nums2);
        System.out.println(treeToList(root2)); // 輸出: [3, 1]
    }

    // Helper method to convert the tree to a list for easy printing
    public static List<Integer> treeToList(Solution.TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Use a queue to perform level order traversal
        Queue<Solution.TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Solution.TreeNode node = queue.poll();
            if (node != null) {
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                result.add(null);
            }
        }

        // Remove trailing nulls
        while (!result.isEmpty() && result.get(result.size() - 1) == null) {
            result.remove(result.size() - 1);
        }

        return result;
    }
}
