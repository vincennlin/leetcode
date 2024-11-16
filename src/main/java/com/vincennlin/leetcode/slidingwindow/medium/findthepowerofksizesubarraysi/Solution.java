package com.vincennlin.leetcode.slidingwindow.medium.findthepowerofksizesubarraysi;
// 3254
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] results = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            if (isConsecutiveAndSorted(nums, i, i + k - 1)) {
                results[i] = nums[i + k - 1];
            } else {
                results[i] = -1;
            }
        }

        return results;
    }

    private boolean isConsecutiveAndSorted(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                return false;
            }
        }
        return true;
    }
}
