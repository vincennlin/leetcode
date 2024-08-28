package com.vincennlin.leetcode.graphgeneral.medium.numberofislands;
//200
class Solution {
    private int m;
    private int n;

    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (i > 0 && grid[i - 1][j] == '1') dfs(grid, i - 1, j);
        if (i < m - 1 && grid[i + 1][j] == '1') dfs(grid, i + 1, j);
        if (j > 0 && grid[i][j - 1] == '1') dfs(grid, i, j - 1);
        if (j < n - 1 && grid[i][j + 1] == '1') dfs(grid, i, j + 1);
    }

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int islandNum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islandNum++;
                }
            }
        }

        return islandNum;
    }
}