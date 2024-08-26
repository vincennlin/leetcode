package com.vincennlin.leetcode.kadanesalgorithm.maximumsumcircularsubarray;

import java.util.Arrays;

//918
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int[] circularNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            circularNums[i] = nums[i];
            circularNums[i + nums.length] = nums[i];
        }

        int currentSum = circularNums[0];
        int maxSum = circularNums[0];

        int startIndex = 0;

        for (int i = 1; i < circularNums.length; i++) {
            if (currentSum + circularNums[i] > circularNums[i] && i - startIndex >= nums.length) {
                if (currentSum + circularNums[i] - circularNums[i-nums.length] > currentSum) {
                    startIndex++;
                    currentSum = currentSum + circularNums[i] - circularNums[i-nums.length];
                }
            } else {
                startIndex = i;
            }
            currentSum = Math.max(circularNums[i], currentSum + circularNums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
