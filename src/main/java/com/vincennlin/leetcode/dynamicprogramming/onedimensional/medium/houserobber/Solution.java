package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.houserobber;
//198
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);
        int current = Math.max(prev1, prev2);

        for (int i = 2; i < nums.length; i++) {
            current = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}
