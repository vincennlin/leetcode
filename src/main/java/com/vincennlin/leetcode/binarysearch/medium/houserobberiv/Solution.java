package com.vincennlin.leetcode.binarysearch.medium.houserobberiv;

import java.util.Arrays;

// 2560
class Solution {
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canRob(nums, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canRob(int[] nums, int k, int capability) {
        int housesRobbed = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= capability) {
                housesRobbed++;
                i++;
            }
        }

        return housesRobbed >= k;
    }
}