package com.vincennlin.leetcode.matrix.medium.countunguardedcellsinthegrid;
// 2257
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        boolean[][] grid = new boolean[m][n];
        boolean[][] guarded = new boolean[m][n];

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = true;
        }

        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = true;
        }

        int[][] directions = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

        for (int[] guard : guards) {
            for (int[] direction : directions) {
                int x = guard[0];
                int y = guard[1];
                while (true) {
                    x += direction[0];
                    y += direction[1];
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y]) {
                        break;
                    }
                    guarded[x][y] = true;
                }
            }
        }

        int unguardedCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!grid[i][j] && !guarded[i][j]) {
                    unguardedCount++;
                }
            }
        }

        return unguardedCount;
    }
}
