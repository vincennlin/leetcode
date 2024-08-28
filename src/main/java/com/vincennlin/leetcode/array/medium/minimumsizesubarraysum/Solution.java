package com.vincennlin.leetcode.array.medium.minimumsizesubarraysum;
//209
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftIndex = 0, rightIndex = 0;
        int sum = 0;
        int minSize = Integer.MAX_VALUE;
        while (rightIndex < nums.length) {
            sum += nums[rightIndex];

            while (sum >= target) {
                minSize = Math.min(rightIndex - leftIndex + 1, minSize);
                sum -= nums[leftIndex++];
            }

            rightIndex++;
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
