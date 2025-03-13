package com.vincennlin.leetcode.binarysearch.medium.zeroarraytransformationii;
// 3356
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        if (isAllLessOrEqualZero(nums)) {
            return 0;
        }

        int length = nums.length;
        int k = Integer.MAX_VALUE;

        int left = 0, right = queries.length - 1;
        int mid;
        boolean isToRight = true;

        while (left <= right) {
            mid = left + (right - left) / 2;
            int[] diffArray = getDiffArray(length, queries, isToRight ? left : mid + 1, isToRight ? mid : right + 1);
            updateNums(nums, diffArray, isToRight);

            if (isAllLessOrEqualZero(nums)) {
                isToRight = false;
                right = mid - 1;
                k = Math.min(k, mid + 1);
            } else {
                isToRight = true;
                left = mid + 1;
            }
        }

        return k == Integer.MAX_VALUE ? - 1 : k;
    }

    private int[] getDiffArray(int length, int[][] queries, int start, int end) {
        int[] diffArray = new int[length + 1];

        for (int i = start; i <= end; i++) {
            diffArray[queries[i][0]] += queries[i][2];
            diffArray[queries[i][1] + 1] -= queries[i][2];
        }

        return diffArray;
    }

    private boolean isAllLessOrEqualZero(int[] nums) {
        for (int num : nums) {
            if (num > 0) {
                return false;
            }
        }
        return true;
    }

    private void updateNums(int[] nums, int[] diffArray, boolean toRight) {
        int diff = 0;

        for (int i = 0; i < nums.length; i++) {
            diff += diffArray[i];

            if (toRight) {
                nums[i] -= diff;
            } else {
                nums[i] += diff;
            }
        }
    }
}