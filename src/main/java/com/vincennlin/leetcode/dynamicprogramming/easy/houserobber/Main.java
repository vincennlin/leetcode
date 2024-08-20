package com.vincennlin.leetcode.dynamicprogramming.easy.houserobber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("nums = [1, 2, 3, 1]: " + solution.rob(nums1));

        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println("nums = [2, 7, 9, 3, 1]: " + solution.rob(nums2));
    }
}

