package com.vincennlin.leetcode.matrix.medium.setmatrixzeroes;
// 73
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean rowZero = false, columnZero = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                columnZero = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                rowZero = true;
                break;
            }
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
            if (columnZero) {
                matrix[i][0] = 0;
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
            if (rowZero) {
                matrix[0][j] = 0;
            }
        }

        matrix[0][0] = rowZero || columnZero ? 0 : matrix[0][0];
    }
}