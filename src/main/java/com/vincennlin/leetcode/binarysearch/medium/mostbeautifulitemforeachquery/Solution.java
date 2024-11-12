package com.vincennlin.leetcode.binarysearch.medium.mostbeautifulitemforeachquery;

import java.util.Arrays;
import java.util.Comparator;

// 2070
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = items.length;

        Arrays.sort(items, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int[] prices = new int[n];
        int[] maxBeautyForPrice = new int[n];
        int maxBeauty = 0;

        for (int i = 0; i < n; i++) {
            prices[i] = items[i][0];
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            maxBeautyForPrice[i] = maxBeauty;
        }

        int m = queries.length;
        int[][] sortedQueries = new int[m][2];
        for (int i = 0; i < m; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }

        Arrays.sort(sortedQueries, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int query = sortedQueries[i][0];
            int originalIndex = sortedQueries[i][1];

            int pos = binarySearch(prices, query);

            if (pos == -1) {
                result[originalIndex] = 0;
            } else {
                result[originalIndex] = maxBeautyForPrice[pos];
            }
        }

        return result;
    }

    private int binarySearch(int[] prices, int query) {
        int left = 0, right = prices.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (prices[mid] <= query) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
