package com.vincennlin.leetcode.binarysearch.medium.searcha2dmartix;
//74
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean isExists = false;

        int left = 0, right = m * n - 1;
        int mid, i, j;

        while (left <= right) {
            mid = left + (right - left) / 2;
            i = mid / n;
            j = mid % n;
            if (target == matrix[i][j]) {
                isExists = true;
                break;
            } else if (target < matrix[i][j]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return isExists;
    }

//    private int m, n;
//
//    public boolean searchMatrix(int[][] matrix, int target) {
//        m = matrix.length;
//        n = matrix[0].length;
//
//        return binarySearch(0, m * n - 1, matrix, target);
//    }
//
//    private boolean binarySearch(int left, int right, int[][] matrix, int target) {
//        if (left > right) return false;
//        int mid = left + (right - left) / 2;
//        int i = mid / n;
//        int j = mid % n;
//        if (target == matrix[i][j]) {
//            return true;
//        } else if (target < matrix[i][j]){
//            return binarySearch(left, mid - 1, matrix, target);
//        } else {
//            return binarySearch(mid + 1, right, matrix, target);
//        }
//    }
}
