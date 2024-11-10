package com.vincennlin.leetcode.bit.medium.shortestsubarraywithoratleastkii;
// 3097
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int[] bitCounts = new int[32];

        while (right < nums.length) {
            updateBitCounts(bitCounts, nums[right], 1);

            while (left <= right && convertBitCountsToNumber(bitCounts) >= k) {
                minLength = Math.min(minLength, right - left + 1);

                updateBitCounts(bitCounts, nums[left], -1);
                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    private void updateBitCounts(int[] bitCounts, int number, int delta) {
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            if (((number >> bitPosition) & 1) != 0) {
                bitCounts[bitPosition] += delta;
            }
        }
    }

    private int convertBitCountsToNumber(int[] bitCounts) {
        int result = 0;
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            if (bitCounts[bitPosition] != 0) {
                result |= 1 << bitPosition;
            }
        }
        return result;
    }
}
