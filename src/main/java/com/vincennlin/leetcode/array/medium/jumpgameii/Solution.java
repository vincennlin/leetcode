package com.vincennlin.leetcode.array.medium.jumpgameii;
//45
class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;
        int minJump = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + nums[i] > farthest) {
                farthest = i + nums[i];
                minJump++;
                if (farthest >= nums.length - 1) return minJump;
            }
        }
        return minJump;
    }
}
