package com.vincennlin.leetcode.binarytree.bfs.medium.cousinsinbinarytreeii;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// 2641
class Solution {
    private Map<Integer, Integer> levelSumMap;

    public TreeNode replaceValueInTree(TreeNode root) {
        levelSumMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            levelSumMap.put(level, sum);
            level++;
        }

        dfs(root, 0, 0);

        return root;
    }

    private void dfs(TreeNode root, int level, int siblingVal) {
        root.val = levelSumMap.get(level) - root.val - siblingVal;
        int leftVal = root.left == null ? 0 : root.left.val;
        int rightVal = root.right == null ? 0 : root.right.val;
        if (root.left != null) {
            dfs(root.left, level + 1, rightVal);
        }
        if (root.right != null) {
            dfs(root.right, level + 1, leftVal);
        }
    }
}