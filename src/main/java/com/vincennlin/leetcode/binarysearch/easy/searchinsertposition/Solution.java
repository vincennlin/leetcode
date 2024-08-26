package com.vincennlin.leetcode.binarysearch.easy.searchinsertposition;
//35
class Solution {
    private int binarySearch(int[] nums, int start, int end, int target) {
        if (start >= end) return end;
        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target <= nums[mid]) {
            return binarySearch(nums, start, mid, target);
        } else {
            return binarySearch(nums, mid + 1, end, target);
        }
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length, target);
    }
}
