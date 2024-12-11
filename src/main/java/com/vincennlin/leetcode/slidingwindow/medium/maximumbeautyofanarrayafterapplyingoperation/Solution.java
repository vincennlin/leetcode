package com.vincennlin.leetcode.slidingwindow.medium.maximumbeautyofanarrayafterapplyingoperation;

import java.util.Arrays;

// 2779
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 1, right = nums.length;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canFit(nums, mid, k)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    private boolean canFit(int[] nums, int length, int k) {
        for (int i = 0; i <= nums.length - length; i++) {
            if (nums[i + length - 1] - nums[i] <= 2 * k) {
                return true;
            }
        }
        return false;
    }
}