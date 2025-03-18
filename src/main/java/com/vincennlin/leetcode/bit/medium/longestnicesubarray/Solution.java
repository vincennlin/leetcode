package com.vincennlin.leetcode.bit.medium.longestnicesubarray;
// 2401
class Solution {
    // if a & b == 0
    // then a ^ b == a + b;
    public int longestNiceSubarray(int[] nums) {
        int longest = 1;
        int bit = nums[0];
        int sum = nums[0];

        int left = 0, right = 0;

        while (left < nums.length && right < nums.length) {
            while (bit == sum) {
                longest = Math.max(longest, right - left + 1);
                right++;
                if (right == nums.length) {
                    break;
                }
                bit ^= nums[right];
                sum += nums[right];
            }

            bit ^= nums[left];
            sum -= nums[left];
            left++;
        }

        return longest;
    }
}
