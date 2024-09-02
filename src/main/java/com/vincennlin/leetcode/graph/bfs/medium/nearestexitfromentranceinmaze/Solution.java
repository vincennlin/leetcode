package com.vincennlin.leetcode.graph.bfs.medium.nearestexitfromentranceinmaze;

import java.util.ArrayDeque;
import java.util.Queue;

// 1926
class Solution {
    private int m;
    private int n;

    public int nearestExit(char[][] maze, int[] entrance) {
        m = maze.length;
        n = maze[0].length;
        int steps = 0;

        Queue<int[]> cellQueue = new ArrayDeque<>();
        cellQueue.add(entrance);

        while (!cellQueue.isEmpty()) {
            int size = cellQueue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = cellQueue.poll();

                if (isExit(entrance, cell)) {
                    return steps;
                }
                maze[cell[0]][cell[1]] = '*';
                addNeighborCells(maze, cellQueue, cell);
            }
            steps++;
        }

        return -1;
    }

    private void addNeighborCells(char[][] maze, Queue<int[]> cellQueue, int[] cell) {
        int i = cell[0];
        int j = cell[1];
        if (i > 0 && maze[i - 1][j] == '.') {
            cellQueue.add(new int[]{i - 1, j});
            maze[i - 1][j] = '*';
        }
        if (i < m - 1 && maze[i + 1][j] == '.') {
            cellQueue.add(new int[]{i + 1, j});
            maze[i + 1][j] = '*';
        }
        if (j > 0 && maze[i][j - 1] == '.') {
            cellQueue.add(new int[]{i, j - 1});
            maze[i][j - 1] = '*';
        }
        if (j < n - 1 && maze[i][j + 1] == '.') {
            cellQueue.add(new int[]{i, j + 1});
            maze[i][j + 1] = '*';
        }
    }

    private boolean isExit(int[] entrance, int[] cell) {
        return (entrance[0] != cell[0] || entrance[1] != cell[1]) &&
                (cell[0] == 0 || cell[0] == m - 1 || cell[1] == 0 || cell[1] == n - 1);
    }
}