package com.vincennlin.leetcode.binarysearch.medium.searcha2dmartix;
/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        System.out.println(solution.searchMatrix(matrix1, 3)); // true

        System.out.println(solution.searchMatrix(matrix1, 13)); // false

        int[][] matrix2 = new int[][]{{1}, {3}};

        System.out.println(solution.searchMatrix(matrix2, 2)); // false;

        int[][] matrix3 = new int[][]{{1, 1}};

        System.out.println(solution.searchMatrix(matrix3, 2)); // false
    }
}
