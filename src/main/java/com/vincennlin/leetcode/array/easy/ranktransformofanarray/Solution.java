package com.vincennlin.leetcode.array.easy.ranktransformofanarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1331
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        Map<Integer, Integer> smallerCountMap = new HashMap<>();
        int count = 0;
        for (int sortedNum : sorted) {
            if (smallerCountMap.containsKey(sortedNum)) continue;
            smallerCountMap.put(sortedNum, count++);
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = smallerCountMap.get(arr[i]) + 1;
        }
        return result;
    }
}