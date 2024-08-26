package com.vincennlin.leetcode.array.medium.jumpgame;
//55
class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int currentMax = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentMax = Math.max(nums[i], --currentMax);
            if (currentMax <= 0) return false;
        }
        return true;
    }
}
