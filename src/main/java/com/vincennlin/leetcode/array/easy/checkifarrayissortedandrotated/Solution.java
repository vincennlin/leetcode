package com.vincennlin.leetcode.array.easy.checkifarrayissortedandrotated;
// 1752
class Solution {
    public boolean check(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        int rotatePoint = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (++rotatePoint > 1) {
                    return false;
                }
            }
        }

        return rotatePoint == 0 || nums[0] >= nums[nums.length - 1];
    }
}