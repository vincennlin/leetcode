package com.vincennlin.leetcode.backtracking.medium.wordsearch;
// 79
class Solution {
    private int m;
    private int n;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtracking(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean backtracking(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean result = backtracking(board, word, i + 1, j, index + 1) ||
                backtracking(board, word, i - 1, j, index + 1) ||
                backtracking(board, word, i, j + 1, index + 1) ||
                backtracking(board, word, i, j - 1, index + 1);

        board[i][j] = temp;
        return result;
    }
}
