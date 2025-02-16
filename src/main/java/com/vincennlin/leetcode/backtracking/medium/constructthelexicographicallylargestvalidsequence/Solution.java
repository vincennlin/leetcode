package com.vincennlin.leetcode.backtracking.medium.constructthelexicographicallylargestvalidsequence;

import java.util.List;

// 1718
class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1];

        boolean[] isNumberUsed = new boolean[n];

        backtracking(0, result, isNumberUsed, n);

        return result;
    }

    private boolean backtracking(int index, int[] result, boolean[] isNumberUsed, int n) {
        if (index == result.length) {
            return true;
        }

        if (result[index] != 0) {
            return backtracking(index + 1, result, isNumberUsed, n);
        }

        for (int next = n; next >= 1; next--) {
            if (isNumberUsed[next - 1]) {
                continue;
            }

            isNumberUsed[next - 1] = true;
            result[index] = next;

            if (next == 1) {
                if (backtracking(index + 1, result, isNumberUsed, n)) {
                    return true;
                }
            } else if (index + next < result.length && result[index + next] == 0) {
                result[index + next] = next;

                if (backtracking(index + 1, result, isNumberUsed, n)) {
                    return true;
                }

                result[index + next] = 0;
            }

            isNumberUsed[next - 1] = false;
            result[index] = 0;
        }

        return false;
    }
}