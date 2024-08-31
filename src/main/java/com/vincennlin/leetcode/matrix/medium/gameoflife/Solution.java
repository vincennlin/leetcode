package com.vincennlin.leetcode.matrix.medium.gameoflife;
// 289
class Solution {
    private int m;
    private int n;

    public void gameOfLife(int[][] board) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int aliveNeighbors = calculateAliveNeighbors(board, i, j);
                if (board[i][j] == 1) {
                    if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if (aliveNeighbors == 3) {
                        board[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = (board[i][j] == 1 || board[i][j] == -1) ? 1 : 0;
            }
        }
    }

    private int calculateAliveNeighbors(int[][] board, int i, int j) {
        int aliveNeighbors = 0;
        for (int a = i - 1; a <= i + 1; a++) {
            if (a < 0 || a >= m) continue;
            for (int b = j - 1; b <= j + 1; b++) {
                if (b < 0 || b >= n || (a == i && b == j)) continue;
                aliveNeighbors += (board[a][b] == 1 || board[a][b] == 2) ? 1 : 0;
            }
        }
        return aliveNeighbors;
    }
}
