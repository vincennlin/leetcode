package com.vincennlin.leetcode.bit.medium.largestcombinationwithbitwiseandgreaterthanzero;
// 2275
class Solution {
    public int largestCombination(int[] candidates) {
        int[] bits = new int[24];
        int max = 0;

        for (int num : candidates) {
            int pos = 0;
            while (num > 0) {
                if ((num & 1) == 1) {
                    bits[pos] += 1;
                    max = Math.max(max, bits[pos]);
                }
                pos++;
                num >>= 1;
            }
        }

        return max;
    }
}