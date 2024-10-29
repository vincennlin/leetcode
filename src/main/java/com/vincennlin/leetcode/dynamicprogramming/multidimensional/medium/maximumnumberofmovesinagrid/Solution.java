package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.maximumnumberofmovesinagrid;

import java.util.Arrays;

// 2684
class Solution {
    public int maxMoves(int[][] grid) {
        int[][] dp = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            dp[i] = new int[grid[0].length];
            Arrays.fill(dp[i], -1);
        }

        int[] dirs = new int[]{-1, 0, 1};

        int maxMoves = 0;

        for (int row = 0; row < grid.length; row++) {
            maxMoves = Math.max(maxMoves, dfs(row, 0, dp, grid, dirs));
        }

        return maxMoves;
    }

    private int dfs(int row, int col, int[][] dp, int[][] grid, int[] dirs) {
        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int maxMoves = 0;

        for (int dir : dirs) {
            int newRow = row + dir;
            int newCol = col + 1;
            if (newRow >= 0 && newRow < grid.length && newCol < grid[0].length && grid[newRow][newCol] > grid[row][col]) {
                maxMoves = Math.max(maxMoves, 1 + dfs(row + dir, col + 1, dp, grid, dirs));
            }
        }

        dp[row][col] = maxMoves;

        return maxMoves;
    }
}
