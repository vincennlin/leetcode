package com.vincennlin.leetcode.matrix.medium.countunguardedcellsinthegrid;
// 2257
class Solution {
    private int result;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] directions = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        char[][] grid = new char[m][n];
        result = m * n;

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = '*';
            result--;
        }

        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = '*';
            result--;
            for (int[] direction : directions) {
                guardGrid(grid, direction, guard[0] + direction[0], guard[1] + direction[1], m, n);
            }
        }

        return result;
    }

    private void guardGrid(char[][] grid, int[] direction, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '*') {
            return;
        }
        if (grid[i][j] !='-' && grid[i][j] != '*') {
            result--;
        }
        grid[i][j] = '-';
        guardGrid(grid, direction, i + direction[0], j + direction[1], m, n);
    }
}
