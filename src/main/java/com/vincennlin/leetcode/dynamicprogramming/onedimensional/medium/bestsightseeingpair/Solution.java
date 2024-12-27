package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.bestsightseeingpair;

// 1014
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxLeftScore = values[0];
        int maxScore = Integer.MIN_VALUE;

        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxLeftScore + values[j] - j);
            maxLeftScore = Math.max(maxLeftScore, values[j] + j);
        }

        return maxScore;
    }
}