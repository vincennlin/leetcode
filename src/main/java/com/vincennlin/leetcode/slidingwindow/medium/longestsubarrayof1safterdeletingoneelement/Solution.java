package com.vincennlin.leetcode.slidingwindow.medium.longestsubarrayof1safterdeletingoneelement;
// 1493
class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int left = 0;
        int count0 = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                count0++;
            }

            while (count0 > 1) {
                if (nums[left] == 0) {
                    count0--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength == nums.length ? maxLength - 1 : maxLength;
    }
}
