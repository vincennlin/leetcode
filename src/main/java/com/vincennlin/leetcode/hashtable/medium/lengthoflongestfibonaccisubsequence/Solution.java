package com.vincennlin.leetcode.hashtable.medium.lengthoflongestfibonaccisubsequence;

import java.util.HashMap;
import java.util.Map;

// 873
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int longest = 0;
        Map<Integer, Integer> numPrevMap = new HashMap<>();
        Map<Integer, Integer> numLengthMap = new HashMap<>();

        numPrevMap.put(arr[0], 0);
        numPrevMap.put(arr[1], arr[0]);
        numLengthMap.put(arr[0], 0);
        numLengthMap.put(arr[1], 0);

        for (int i = 2; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < i; j++) {
                int prev = arr[j];
                if (numPrevMap.containsKey(num - prev)
                        && prev > num - prev) {
                    if (numLengthMap.getOrDefault(num, 0) < 3) {
                        numLengthMap.put(num, 3);
                        numPrevMap.put(num, prev);
                    }

                    if (num - prev == numPrevMap.get(prev)
                            && (numLengthMap.getOrDefault(num, 0) < numLengthMap.get(prev) + 1)) {
                        numPrevMap.put(num, prev);
                        numLengthMap.put(num, numLengthMap.get(prev) == 0 ? 3 : numLengthMap.get(prev) + 1);
                    }
                }
            }

            numPrevMap.putIfAbsent(num, arr[i - 1]);
            numLengthMap.putIfAbsent(num, 0);

            longest = Math.max(longest, numLengthMap.get(num));
        }

        return longest;
    }
}