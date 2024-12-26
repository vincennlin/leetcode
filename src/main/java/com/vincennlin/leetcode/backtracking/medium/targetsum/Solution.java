package com.vincennlin.leetcode.backtracking.medium.targetsum;
// 494
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, target, 0, 0, true) + dfs(nums, target, 0, 0, false);
    }

    private int dfs(int[] nums, int target, int i, int val, boolean isPlus) {
        val += isPlus ? nums[i] : -nums[i];

        if (i == nums.length - 1) {
            return val == target ? 1 : 0;
        }

        return dfs(nums, target, i + 1, val, isPlus) + dfs(nums, target, i + 1, val, !isPlus);
    }
}