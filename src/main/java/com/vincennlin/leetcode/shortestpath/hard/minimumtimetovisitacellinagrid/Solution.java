package com.vincennlin.leetcode.shortestpath.hard.minimumtimetovisitacellinagrid;

import java.util.PriorityQueue;
import java.util.Queue;

// 2577
class Solution {
    private int m, n;
    private boolean[][] isVisited;

    public int minimumTime(int[][] grid) {
        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }

        m = grid.length;
        n = grid[0].length;

        Queue<Node> pq = new PriorityQueue<>((a, b) -> a.currentTime - b.currentTime);
        pq.add(new Node(0, 0, 0));

        int[][] directions = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

        isVisited = new boolean[m][n];

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (node.row == m - 1 && node.col == n - 1) {
                return node.currentTime;
            }

            if (isVisited[node.row][node.col]) {
                continue;
            }

            isVisited[node.row][node.col] = true;

            for (int[] direction : directions) {
                int newRow = node.row + direction[0];
                int newCol = node.col + direction[1];
                if (isValid(newRow, newCol)) {
                    int newTime;
                    if (node.currentTime >= grid[newRow][newCol]) {
                        newTime = node.currentTime + 1;
                    } else {
                        if ((grid[newRow][newCol] - node.currentTime) % 2 == 1) {
                            newTime = grid[newRow][newCol];
                        } else {
                            newTime = grid[newRow][newCol] + 1;
                        }
                    }
                    pq.add(new Node(newTime, newRow, newCol));
                }
            }
        }

        return -1;
    }

    private boolean isValid(int newRow, int newCol) {
        return newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !isVisited[newRow][newCol];
    }
}

class Node {
    int currentTime;
    int row;
    int col;

    Node(int currentTime, int row, int col) {
        this.currentTime = currentTime;
        this.row = row;
        this.col = col;
    }
}