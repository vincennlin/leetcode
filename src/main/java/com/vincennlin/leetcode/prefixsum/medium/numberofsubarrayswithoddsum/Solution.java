package com.vincennlin.leetcode.prefixsum.medium.numberofsubarrayswithoddsum;
// 1524
class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;

        int oddSumCount = 0;
        int evenSumCount = 1;

        int result = 0;
        long prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                result += oddSumCount;
                evenSumCount++;
            } else {
                result += evenSumCount;
                oddSumCount++;
            }

            result %= MOD;
        }

        return result;
    }
}