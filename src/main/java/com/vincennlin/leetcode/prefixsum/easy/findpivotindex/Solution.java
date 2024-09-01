package com.vincennlin.leetcode.prefixsum.easy.findpivotindex;
// 724
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++) {
            sumLeft[i] = sum;
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            sumRight[i] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }

        return -1;
    }
}
