package com.vincennlin.leetcode.binarytree.bfs.medium.minimumnumberofoperationstosortabinarytreebylevel;

import java.util.*;

// 2471
class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int result = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int[] levelNums = new int[levelSize];
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelNums[i] = node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result += getSwaps(levelNums);
        }

        return result;
    }

    private int getSwaps(int[] nums) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numIndexMap.put(nums[i], i);
        }

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        int swaps = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != sortedNums[i]) {
                int correctNum = sortedNums[i];
                int newNumIndex = numIndexMap.get(correctNum);
                nums[newNumIndex] = num;
                numIndexMap.put(num, newNumIndex);
                swaps++;
            }
        }

        return swaps;
    }
}