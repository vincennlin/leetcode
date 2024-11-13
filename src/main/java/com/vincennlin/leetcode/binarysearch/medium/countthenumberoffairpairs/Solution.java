package com.vincennlin.leetcode.binarysearch.medium.countthenumberoffairpairs;

import java.util.Arrays;

// 2563
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long result = 0;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int lowerBoundary = lower - num;
            int upperBoundary = upper - num + 1;

            int lowerIndex = binarySearch(nums, i + 1, n - 1, lowerBoundary);
            int upperIndex = binarySearch(nums, i + 1, n - 1, upperBoundary);

            result += upperIndex - lowerIndex;
        }

        return result;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}