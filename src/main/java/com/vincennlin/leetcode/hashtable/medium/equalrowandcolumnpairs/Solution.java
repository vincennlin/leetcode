package com.vincennlin.leetcode.hashtable.medium.equalrowandcolumnpairs;

import java.util.*;

// 2352
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
        }

        int pairs = 0;

        for (int j = 0; j < n; j++) {
            List<Integer> col = new ArrayList<>();
            for (int[] ints : grid) {
                col.add(ints[j]);
            }
            pairs += rowMap.getOrDefault(col, 0);
        }

        return pairs;
    }
}
