package com.vincennlin.leetcode.matrix.medium.spiralmatrixiv;

import java.util.Arrays;

// 2326
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][];
        for (int i = 0; i < m; i++) {
            int[] row = new int[n];
            Arrays.fill(row, -1);
            result[i] = row;
        }

        int top = 0, left = 0;
        int bottom = m - 1, right = n - 1;

        while (head != null) {
            for (int j = left; j <= right; j++) {
                result[top][j] = head.val;
                head = head.next;
                if (head == null) return result;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = head.val;
                head = head.next;
                if (head == null) return result;
            }
            right--;

            for (int j = right; j >= left; j--) {
                result[bottom][j] = head.val;
                head = head.next;
                if (head == null) return result;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                result[i][left] = head.val;
                head = head.next;
                if (head == null) return result;
            }
            left++;
        }

        return result;
    }
}
