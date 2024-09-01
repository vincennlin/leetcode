package com.vincennlin.leetcode.twopointer.medium.maxnumberofksumpairs;

import java.util.Arrays;

// 1679
class Solution {
    public int maxOperations(int[] nums, int k) {
        if (nums.length < 2) return 0;

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] == k) {
                count++;
                left++;
                right--;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else {
                left++;
            }
        }

        return count;
    }
}
