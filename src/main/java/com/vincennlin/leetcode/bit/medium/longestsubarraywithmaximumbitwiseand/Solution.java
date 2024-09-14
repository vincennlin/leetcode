package com.vincennlin.leetcode.bit.medium.longestsubarraywithmaximumbitwiseand;
// 2419
class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        int length = 0;
        int currentLength = 0;

        for (int num : nums) {
            if (num == max) {
                currentLength++;
                length = Math.max(currentLength, length);
            } else if (num > max) {
                max = num;
                currentLength = 1;
                length = 1;
            } else {
                currentLength = 0;
            }
        }

        return length;
    }
}