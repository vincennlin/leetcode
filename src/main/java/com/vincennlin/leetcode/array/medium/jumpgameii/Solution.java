package com.vincennlin.leetcode.array.medium.jumpgameii;
//45
class Solution {
    public int jump(int[] nums) {
        int minJump = 0;
        int farthest = 0;
        int currentEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                minJump++;
                currentEnd = farthest;
                if (currentEnd >= nums.length - 1) break;
            }
        }
        return minJump;
    }
}
