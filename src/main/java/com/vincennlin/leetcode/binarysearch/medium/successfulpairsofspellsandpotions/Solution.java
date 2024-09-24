package com.vincennlin.leetcode.binarysearch.medium.successfulpairsofspellsandpotions;

import java.util.Arrays;

// 2300
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int m = spells.length;
        int n = potions.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int left = 0, right = n - 1;
            int mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = n - left;
        }

        return result;
    }
}