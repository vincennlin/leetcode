package com.vincennlin.leetcode.graphgeneral.medium.surroundedregions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//130
class Solution {
    private int m;
    private int n;
    private Set<List<Integer>> marked;

    private void dfs(int i, int j, char[][] board) {
        marked.add(List.of(i, j));
        if (i > 0 && board[i - 1][j] == 'O' && !marked.contains(List.of(i - 1, j))) dfs(i - 1, j, board);
        if (i < m - 1 && board[i + 1][j] == 'O' && !marked.contains(List.of(i + 1, j))) dfs(i + 1, j, board);
        if (j > 0 && board[i][j - 1] == 'O' && !marked.contains(List.of(i, j - 1))) dfs(i, j - 1, board);
        if (j < n - 1 && board[i][j + 1] == 'O' && !marked.contains(List.of(i, j + 1))) dfs(i, j + 1, board);
    }

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        marked = new HashSet<>();

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(i, 0, board);
            if (board[i][n - 1] == 'O') dfs(i, n - 1, board);
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') dfs(0, j, board);
            if (board[m - 1][j] == 'O') dfs(m - 1, j, board);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !marked.contains(List.of(i, j))) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
