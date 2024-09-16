package com.vincennlin.leetcode.math.medium.minimumtimedifference;

import java.util.*;

// 539
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int m = timePoints.size();
        int[] minutes = new int[m];

        for (int i = 0; i < m; i++) {
            minutes[i] = toMinute(timePoints.get(i));
        }

        Arrays.sort(minutes);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < m; i++) {
            minDiff = Math.min(minDiff, minutes[i] - minutes[i - 1]);
        }

        minDiff = Math.min(minDiff, 1440 + minutes[0] - minutes[m - 1]);

        return minDiff;
    }

    private int toMinute(String timePoint) {
        return 60 * Integer.parseInt(timePoint.substring(0, 2)) + Integer.parseInt(timePoint.substring(3, 5));
    }
}