package com.vincennlin.leetcode.binarytree.bfs.medium.maximumlevelsumofabinarytree;

import java.util.LinkedList;
import java.util.Queue;

// 1161
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int currentLevel = 0;
        int maxLevel = 1;
        int maxLevelSum = Integer.MIN_VALUE;

        while (!nodeQueue.isEmpty()) {
            currentLevel++;
            int levelSize = nodeQueue.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = nodeQueue.poll();
                if (currentNode.left != null) nodeQueue.add(currentNode.left);
                if (currentNode.right != null) nodeQueue.add(currentNode.right);
                levelSum += currentNode.val;
            }

            if (levelSum > maxLevelSum) {
                maxLevelSum = levelSum;
                maxLevel = currentLevel;
            }
        }

        return maxLevel;
    }
}
