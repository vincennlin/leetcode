package com.vincennlin.leetcode.dfs.medium.maximumnumberoffishinagrid;
// 2658
class Solution {
    private final int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private int m, n;

    public int findMaxFish(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean[][] isVisited = new boolean[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0 && !isVisited[i][j]) {
                    max = Math.max(max, dfs(i, j, grid, isVisited));
                }
            }
        }

        return max;
    }

    private int dfs(int i, int j, int[][] grid, boolean[][] isVisited) {
        if (isValidCell(i, j) && grid[i][j] != 0 && !isVisited[i][j]) {
            isVisited[i][j] = true;
            int temp = grid[i][j];
            for (int[] direction : directions) {
                temp += dfs(i + direction[0], j + direction[1], grid, isVisited);
            }
            return temp;
        } else {
            return 0;
        }
    }

    private boolean isValidCell(int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}