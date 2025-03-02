package com.vincennlin.leetcode.twopointers.easy.mergetwo2darraysbysummingvalues;

import java.util.HashMap;
import java.util.Map;

// 2570
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> numSumMap = new HashMap<>();

        for (int[] pair : nums1) {
            numSumMap.put(pair[0], pair[1]);
        }

        for (int[] pair : nums2) {
            numSumMap.put(pair[0], numSumMap.getOrDefault(pair[0], 0) + pair[1]);
        }

        int[][] result = new int[numSumMap.size()][2];
        int index = 0;

        for (int i = 1; i <= 1000; i++) {
            if (numSumMap.isEmpty()) {
                break;
            }

            if (numSumMap.containsKey(i)) {
                result[index++] = new int[]{i, numSumMap.get(i)};
                numSumMap.remove(i);
            }
        }

        return result;
    }
}