package com.vincennlin.leetcode.binarysearch.easy.searchinsertposition;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,3,5,6};
        System.out.println(solution.searchInsert(nums1, 5));// 2

        int[] nums2 = {1,3,5,6};
        System.out.println(solution.searchInsert(nums2, 2));// 1

        int[] nums3 = {1,3,5,6};
        System.out.println(solution.searchInsert(nums3, 7));// 4

        int[] nums4 = {1,3,5,6};
        System.out.println(solution.searchInsert(nums4, 0));// 0

        int[] nums5 = {1};
        System.out.println(solution.searchInsert(nums5, 0));// 0
    }
}
