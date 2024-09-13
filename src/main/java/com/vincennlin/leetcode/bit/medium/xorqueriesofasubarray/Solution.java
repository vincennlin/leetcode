package com.vincennlin.leetcode.bit.medium.xorqueriesofasubarray;
// 1310
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int m = arr.length;
        int n = queries.length;
        int[] xorArray = new int[m];
        xorArray[0] = arr[0];

        for(int i = 1; i < m; i++) {
            xorArray[i] = xorArray[i - 1] ^ arr[i];
        }


        int[] result = new int[n];
        for (int j = 0; j < n; j++) {
            if (queries[j][0] == 0) {
                result[j] = xorArray[queries[j][1]];
            } else {
                result[j] = xorArray[queries[j][1]] ^ xorArray[queries[j][0] - 1];
            }
        }

        return result;
    }
}
