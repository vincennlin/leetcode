package com.vincennlin.leetcode.kadanesalgorithm.maximumsumcircularsubarray;
/*
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.

Example 1:

Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.

Example 2:

Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

Example 3:

Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.


Constraints:

n == nums.length
1 <= n <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,-2,3,-2};
        System.out.println(solution.maxSubarraySumCircular(nums1));

        int[] nums2 = {5,-3,5};
        System.out.println(solution.maxSubarraySumCircular(nums2));

        int[] nums3 = {-3,-2,-3};
        System.out.println(solution.maxSubarraySumCircular(nums3));

        int [] nums4 = {-5,4,-6};
        System.out.println(solution.maxSubarraySumCircular(nums4));// 4

        int [] nums5 = {5,-3,5};
        System.out.println(solution.maxSubarraySumCircular(nums5));// 10

        int [] nums6 = {-2,4,-5,4,-5,9,4};
        System.out.println(solution.maxSubarraySumCircular(nums6));// 15
    }
}
