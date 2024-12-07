package com.vincennlin.leetcode.binarysearch.medium.minimumlimitofballsinabag;

import java.util.Arrays;

// 1760
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int sum = Arrays.stream(nums).sum();
        int bagsNum = (nums.length + maxOperations);

        return binarySearch(sum, bagsNum);
    }

    private int binarySearch(int sum, int bagsNum) {
        int left = 1, right = sum;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * bagsNum < sum) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}