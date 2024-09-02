package com.vincennlin.leetcode.binarytree.general.medium.pathsumiii;

import java.util.*;

// 437
class Solution {
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        List<Integer> sumList = new ArrayList<>();
        count = 0;
        traverse(root, targetSum, sumList);
        return count;
    }

    private void traverse(TreeNode currentNode, int targetSum, List<Integer> sumList) {
        if (currentNode == null) return;

        List<Integer> newSumList = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            int newSum = currentNode.val + sumList.get(i);
            if (newSum == targetSum) {
                count++;
            }
            newSumList.add(newSum);
        }
        if (currentNode.val == targetSum) {
            count++;
        }
        newSumList.add(currentNode.val);

        traverse(currentNode.left, targetSum, newSumList);

        traverse(currentNode.right, targetSum, newSumList);
    }
}
