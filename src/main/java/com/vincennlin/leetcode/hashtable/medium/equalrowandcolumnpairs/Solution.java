package com.vincennlin.leetcode.hashtable.medium.equalrowandcolumnpairs;

import java.util.*;

// 2352
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        Set<List<Integer>> rowSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            rowSet.add(row);
        }

        int pairs = n - rowSet.size();

        for (int j = 0; j < n; j++) {
            List<Integer> col = new ArrayList<>();
            for (int[] ints : grid) {
                col.add(ints[j]);
            }
            if (rowSet.contains(col)) {
                pairs++;
            } else {
                rowSet.add(col);
            }
        }

        return pairs;
    }
}
