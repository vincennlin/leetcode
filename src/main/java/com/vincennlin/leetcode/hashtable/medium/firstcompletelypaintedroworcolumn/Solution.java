package com.vincennlin.leetcode.hashtable.medium.firstcompletelypaintedroworcolumn;

import java.util.HashMap;
import java.util.Map;

// 2661
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        int[] rows = new int[m], cols = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int row = map.get(num)[0], col = map.get(num)[1];
            if (++rows[row] == n || ++cols[col] == m) {
                return i;
            }
        }

        return -1;
    }
}