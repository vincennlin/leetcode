package com.vincennlin.leetcode.kadanesalgorithm.maximumsubarray;
/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104

 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println(solution.maxSubArray(nums2));

        int[] nums3 = {5,4,-1,7,8};
        System.out.println(solution.maxSubArray(nums3));
    }
}
