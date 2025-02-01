package com.vincennlin.leetcode.array.easy.specialarrayi;
// 3151
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                return false;
            }
        }

        return true;
    }
}