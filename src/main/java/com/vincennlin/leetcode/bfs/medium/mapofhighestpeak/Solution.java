package com.vincennlin.leetcode.bfs.medium.mapofhighestpeak;

import java.util.LinkedList;
import java.util.Queue;

// 1765
class Solution {
    int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        boolean[][] isVisited = new boolean[m][n];
        int[][] map = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    queue.add(new int[]{i, j, 0});
                    isVisited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] element = queue.poll();
            int i = element[0];
            int j = element[1];
            int height = element[2];

            map[i][j] = height;

            for (int[] direction : directions) {
                if (isValidCell(m, n, i + direction[0], j + direction[1])
                        && !isVisited[i + direction[0]][j + direction[1]]) {
                    queue.add(new int[]{i + direction[0], j + direction[1], height + 1});
                    isVisited[i + direction[0]][j + direction[1]] = true;
                }
            }

        }

        return map;
    }

    private boolean isValidCell(int m, int n, int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}