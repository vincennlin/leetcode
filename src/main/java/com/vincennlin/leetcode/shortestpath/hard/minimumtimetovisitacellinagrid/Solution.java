package com.vincennlin.leetcode.shortestpath.hard.minimumtimetovisitacellinagrid;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 2577
class Solution {
    public int minimumTime(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<Node> pq = new PriorityQueue<>((a, b) -> a.currentTime - b.currentTime);
        pq.add(new Node(0, 0, 0));

        int[][] directions = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

        int[][] time = new int[m][n];
        for (int[] row : time) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        time[0][0] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            for (int[] direction : directions) {
                int newRow = node.row + direction[0];
                int newCol = node.col + direction[1];
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
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
                    // 要判斷新的時間是否小於之前走過該格的時間，不然 pq 會一直有走過的格子
                    if ((node.row != 0 || node.col != 0 || newTime == 1) && newTime < time[newRow][newCol]) {
                        time[newRow][newCol] = newTime;
                        if (newRow == m - 1 && newCol == n - 1) {
                            return newTime;
                        }
                        pq.add(new Node(newTime, newRow, newCol));
                    }
                }
            }
        }

        return time[m - 1][n - 1] != Integer.MAX_VALUE ? time[m - 1][n - 1] : -1;
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