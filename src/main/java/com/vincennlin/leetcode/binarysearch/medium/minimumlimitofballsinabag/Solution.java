package com.vincennlin.leetcode.binarysearch.medium.minimumlimitofballsinabag;

import java.util.Arrays;

// 1760
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canDivide(nums, mid, maxOperations)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canDivide(int[] nums, int maxSize, int maxOperations) {
        int operations = 0;
        for (int num : nums) {
            if (num > maxSize) {
                operations += (num - 1) / maxSize;
            }
            if (operations > maxOperations) {
                return false;
            }
        }
        return true;
    }
}