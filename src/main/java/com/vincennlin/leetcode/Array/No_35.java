package com.vincennlin.leetcode.Array;

public class No_35 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,11,18,26};
        int target = 19;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
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
