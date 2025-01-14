package com.vincennlin.leetcode.array.medium.findtheprefixcommonarrayoftwoarrays;
// 2657
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[n];

        int[] result = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (++freq[A[i] - 1] > 1) {
                ans++;
            }
            if (++freq[B[i] - 1] > 1) {
                ans++;
            }
            result[i] = ans;
        }

        return result;
    }
}