package com.vincennlin.leetcode.math.medium.minimumtimedifference;

import java.util.*;

// 539
class Solution {
    public int findMinDifference(List<String> timePoints) {

        List<Integer> minutes = new ArrayList<>();

        for (String timePoint : timePoints) {
            minutes.add(toMinute(timePoint));
        }

        Collections.sort(minutes);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < minutes.size(); i++) {
            minDiff = Math.min(minDiff, minutes.get(i) - minutes.get(i - 1));
        }

        minDiff = Math.min(minDiff, 1440 + minutes.get(0) - minutes.get(minutes.size() - 1));

        return minDiff;
    }

    private int toMinute(String timePoint) {
        return 60 * Integer.parseInt(timePoint.substring(0, 2)) + Integer.parseInt(timePoint.substring(3, 5));
    }
}