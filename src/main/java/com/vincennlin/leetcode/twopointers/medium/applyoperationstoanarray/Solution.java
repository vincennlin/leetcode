package com.vincennlin.leetcode.twopointers.medium.applyoperationstoanarray;
// 2460
class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }

        int left = 0, right = 0;

        while (left < nums.length && right < nums.length) {
            while (left < nums.length && nums[left] != 0) {
                left++;
            }

            right = left + 1;

            while (right < nums.length && nums[right] == 0) {
                right++;
            }

            if (right < nums.length) {
                nums[left++] = nums[right];
                nums[right++] = 0;
            }
        }

        return nums;
    }
}