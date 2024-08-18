package com.vincennlin.leetcode.array.easy.searchinsertposition;
//35
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int n = 0;
        while (i <= j) {
            n = (i + j) / 2;
            if (nums[n] < target) {
                i = n + 1;
            } else if (nums[n] > target) {
                j = n - 1;
            } else {
                return n;
            }
        };
        return i;
    }
}
