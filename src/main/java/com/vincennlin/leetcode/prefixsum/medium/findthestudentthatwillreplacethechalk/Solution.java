package com.vincennlin.leetcode.prefixsum.medium.findthestudentthatwillreplacethechalk;
// 1894
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long[] prefixSum = new long[n];
        prefixSum[0] = chalk[0];
        long sum = chalk[0];

        for (int i = 1; i < n ; i++) {
            prefixSum[i] = prefixSum[i - 1] + chalk[i];
            sum += chalk[i];
        }

        k = (int)(k % sum);

        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (k < prefixSum[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}