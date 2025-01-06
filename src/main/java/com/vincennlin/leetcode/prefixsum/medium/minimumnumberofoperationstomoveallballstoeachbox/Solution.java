package com.vincennlin.leetcode.prefixsum.medium.minimumnumberofoperationstomoveallballstoeachbox;
// 1769
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] left = new int[n];
        int[] right = new int[n];
        int ballCount = 0;

        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i - 1) == '1') {
                ballCount++;
            }
            left[i] = left[i - 1] + ballCount;
        }

        ballCount = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (boxes.charAt(i + 1) == '1') {
                ballCount++;
            }
            right[i] = right[i + 1] + ballCount;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = left[i] + right[i];
        }

        return result;
    }
}