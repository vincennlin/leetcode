package com.vincennlin.leetcode.array.medium.minimumsizesubarraysum;
//209
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftIndex = 0, rightIndex = 0;
        int sum = nums[0];
        int minSize = Integer.MAX_VALUE;
        while (rightIndex < nums.length) {
            if (sum < target) {
                rightIndex++;
                if (rightIndex == nums.length) return minSize != Integer.MAX_VALUE ? minSize : 0;
                sum += nums[rightIndex];
            } else {
                if (rightIndex - leftIndex + 1 < minSize) {
                    minSize = rightIndex - leftIndex + 1;
                }
                sum -= nums[leftIndex];
                leftIndex++;
            }
        }
        return minSize;
    }
}
