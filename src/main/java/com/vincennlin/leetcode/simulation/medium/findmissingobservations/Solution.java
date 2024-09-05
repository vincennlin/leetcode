package com.vincennlin.leetcode.simulation.medium.findmissingobservations;

import java.util.Arrays;

// 2028
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int rollsSum = 0;
        for (int roll : rolls) {
            rollsSum += roll;
        }

        int missingSum = (rolls.length + n) * mean - rollsSum;

        if (missingSum < n || missingSum > n * 6) {
            return new int[]{};
        }

        int[] result = new int[n];
        Arrays.fill(result, missingSum / n);
        missingSum = missingSum % n;

        for (int i = 0; i < missingSum; i++) {
            result[i] ++;
        }

        return result;
    }
}