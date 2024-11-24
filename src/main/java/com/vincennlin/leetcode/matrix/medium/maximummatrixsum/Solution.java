package com.vincennlin.leetcode.matrix.medium.maximummatrixsum;
// 1975
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long result = 0;
        int minAbsValue = Integer.MAX_VALUE;
        boolean isNegativeCountEven = true;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) {
                    isNegativeCountEven = !isNegativeCountEven;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(num));
                result += Math.abs(num);
            }
        }

        return result - (isNegativeCountEven ? 0 : minAbsValue + minAbsValue);
    }
}