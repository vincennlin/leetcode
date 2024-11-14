package com.vincennlin.leetcode.binarysearch.medium.minimizedmaximumofproductsdistributedtoanystore;

import java.util.Arrays;

// 2064
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = Arrays.stream(quantities).max().getAsInt();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(quantities, n, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canDistribute(int[] quantities, int n, int maxProductsPerStore) {
        int storesNeeded = 0;
        for (int quantity : quantities) {
            storesNeeded += (quantity + maxProductsPerStore - 1) / maxProductsPerStore;
            if (storesNeeded > n) {
                return false;
            }
        }
        return true;
    }
}