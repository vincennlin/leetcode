package com.vincennlin.leetcode.graphgeneral.medium.numberofislands;

import java.util.LinkedList;
import java.util.Queue;

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

//
//    private void bfs(char[][] grid, Queue<int[]> queue) {
//        while (!queue.isEmpty()) {
//            int[] pos = queue.poll();
//            int i = pos[0];
//            int j = pos[1];
//            grid[i][j] = '0';
//
//            if (i > 0 && grid[i - 1][j] == '1') queue.add(new int[]{i - 1, j});
//            if (i < m - 1 && grid[i + 1][j] == '1') queue.add(new int[]{i + 1, j});
//            if (j > 0 && grid[i][j - 1] == '1') queue.add(new int[]{i, j - 1});
//            if (j < n - 1 && grid[i][j + 1] == '1') queue.add(new int[]{i, j + 1});
//        }
//    }
//
//    public int numIslands(char[][] grid) {
//        m = grid.length;
//        n = grid[0].length;
//        int islandNum = 0;
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (grid[i][j] == '1') {
//                    Queue<int[]> queue = new LinkedList<>();
//                    queue.add(new int[]{i, j});
//                    bfs(grid, queue);
//                    islandNum++;
//                }
//            }
//        }
//
//        return islandNum;
//    }
}