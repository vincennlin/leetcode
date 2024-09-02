package com.vincennlin.leetcode.binarytree.general.medium.pathsumiii;

import java.util.*;

// 437
class Solution {
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> pathSumMap = new HashMap<>();
        pathSumMap.put(0L, 1);
        count = 0;
        traverse(root, 0, targetSum, pathSumMap);
        return count;
    }

    private void traverse(TreeNode currentNode, long currentSum, int targetSum, Map<Long, Integer> pathSumMap) {
        if (currentNode == null) return;

        currentSum += currentNode.val;

        if (pathSumMap.containsKey(currentSum - targetSum)) {
            count += pathSumMap.get(currentSum - targetSum);
        }

        pathSumMap.put(currentSum, pathSumMap.getOrDefault(currentSum, 0) + 1);

        traverse(currentNode.left, currentSum, targetSum, pathSumMap);
        traverse(currentNode.right, currentSum, targetSum, pathSumMap);

        pathSumMap.put(currentSum, pathSumMap.get(currentSum) - 1);
    }
}
