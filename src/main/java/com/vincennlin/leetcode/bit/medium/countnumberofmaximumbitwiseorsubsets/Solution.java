package com.vincennlin.leetcode.bit.medium.countnumberofmaximumbitwiseorsubsets;
// 2044
class Solution {
    private int[] nums;
    private int count;
    private int maxOr;

    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        this.count = 0;
        this.maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        dfs(0, 0);
        return count;
    }

    private void dfs(int index, int currentOr) {
        if (index == nums.length) {
            if (currentOr == maxOr) {
                count++;
            }
            return;
        }
        dfs(index + 1, currentOr | nums[index]);
        dfs(index + 1, currentOr);
    }
}
