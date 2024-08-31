package com.vincennlin.leetcode.matrix.medium.setmatrixzeroes;
/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution.setZeroes(matrix1);
        for (int[] row : matrix1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // 1 0 1
        // 0 0 0
        // 1 0 1

        int[][] matrix2 = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.setZeroes(matrix2);
        for (int[] row : matrix2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // 0 0 0 0
        // 0 4 5 0
        // 0 3 1 0

        // [[1,0]]
        int[][] matrix3 = new int[][]{{1, 0}};
        solution.setZeroes(matrix3);
        for (int[] row : matrix3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
