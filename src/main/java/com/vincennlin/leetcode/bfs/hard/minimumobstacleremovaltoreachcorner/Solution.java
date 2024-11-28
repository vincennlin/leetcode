package com.vincennlin.leetcode.bfs.hard.minimumobstacleremovaltoreachcorner;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 2290
class Solution {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int[][] distance = new int[m][n];

        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0});
        distance[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            int i = current[0], j = current[1];

            for (int[] direction : directions) {
                int nextI = i + direction[0];
                int nextJ = j + direction[1];

                if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n) {
                    int newDist = distance[i][j] + grid[nextI][nextJ];

                    if (newDist < distance[nextI][nextJ]) {
                        distance[nextI][nextJ] = newDist;

                        if (grid[nextI][nextJ] == 0) {
                            deque.addFirst(new int[]{nextI, nextJ});
                        } else {
                            deque.addLast(new int[]{nextI, nextJ});
                        }
                    }
                }
            }
        }

        return distance[m-1][n-1];
    }
}