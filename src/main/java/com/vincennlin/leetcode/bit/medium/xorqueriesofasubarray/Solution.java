package com.vincennlin.leetcode.bit.medium.xorqueriesofasubarray;
// 1310
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int m = queries.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int xor = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                xor ^= arr[j];
            }
            result[i] = xor;
        }

        return result;
    }
}
