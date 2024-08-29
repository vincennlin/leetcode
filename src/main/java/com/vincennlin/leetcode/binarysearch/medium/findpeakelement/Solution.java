package com.vincennlin.leetcode.binarysearch.medium.findpeakelement;
//162
class Solution {
    public int findPeakElement(int[] nums) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        int mid;

        while (leftIndex <= rightIndex) {
            mid = leftIndex + (rightIndex - leftIndex) / 2;
            int left = mid != 0 ? nums[mid - 1] : Integer.MIN_VALUE;
            int right = mid != nums.length - 1 ? nums[mid + 1] : Integer.MIN_VALUE;

            if (nums[mid] > left && nums[mid] > right) {
                return mid;
            } else if (right > left) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }

        return 0;
    }
}
