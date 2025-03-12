package com.vincennlin.leetcode.binarysearch.easy.maximumcountofpositiveintegerandnegativeinteger;
// 2529
class Solution {
    public int maximumCount(int[] nums) {
        int neg = binarySearch(nums, -1);
        while (neg < nums.length - 1 && nums[neg + 1] < 0) {
            neg++;
        }

        int pos = binarySearch(nums, 1);
        while (pos > 0 && nums[pos - 1] > 0) {
            pos--;
        }

        return Math.max(neg + 1, nums.length - pos);
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return target < 0 ? right : left;
    }
}