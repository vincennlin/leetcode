package com.vincennlin.leetcode.hashtable.easy.findmissingandrepeatedvalues;

import java.util.HashSet;
import java.util.Set;

// 2965
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        int n = grid.length;
        int sum = ((n * n + 1) * n * n) / 2;

        for (int[] row : grid) {
            for (int num : row) {
                if (set.contains(num)) {
                    result[0] = num;
                } else {
                    set.add(num);
                    sum -= num;
                }
            }
        }
        result[1] = sum;

        return result;
    }
}