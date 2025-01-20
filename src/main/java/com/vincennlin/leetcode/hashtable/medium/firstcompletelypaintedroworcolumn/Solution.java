package com.vincennlin.leetcode.hashtable.medium.firstcompletelypaintedroworcolumn;
// 2661
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] map = new int[m * n][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[mat[i][j] - 1] = new int[]{i, j};
            }
        }

        int[] rows = new int[m], cols = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int row = map[num - 1][0], col = map[num - 1][1];
            if (++rows[row] == n || ++cols[col] == m) {
                return i;
            }
        }

        return -1;
    }
}