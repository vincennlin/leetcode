package com.vincennlin.leetcode.hashtable.medium.findthenumberofdistinctcolorsamongtheballs;

import java.util.HashMap;
import java.util.Map;

// 3160
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColorMap = new HashMap<>();
        Map<Integer, Integer> colorCountMap = new HashMap<>();
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int ball = query[0];
            int color = query[1];

            if (ballColorMap.containsKey(ball)) {
                int prevColor = ballColorMap.get(ball);
                colorCountMap.put(prevColor, colorCountMap.get(prevColor) - 1);

                if (colorCountMap.get(prevColor) == 0) {
                    colorCountMap.remove(prevColor);
                }
            }

            ballColorMap.put(ball, color);
            colorCountMap.put(color, colorCountMap.getOrDefault(color, 0) + 1);

            result[i] = colorCountMap.keySet().size();
        }

        return result;
    }
}