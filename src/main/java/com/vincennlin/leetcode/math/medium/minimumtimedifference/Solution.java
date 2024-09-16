package com.vincennlin.leetcode.math.medium.minimumtimedifference;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// 539
class Solution {
    public int findMinDifference(List<String> timePoints) {

        PriorityQueue<Integer> minutes = new PriorityQueue<>();

        for (String timePoint : timePoints) {
            minutes.add(toMinute(timePoint));
        }

        int firstMinute = minutes.peek();
        int minDiff = Integer.MAX_VALUE;

        while (minutes.size() > 1) {
            minDiff = Math.min(minDiff, -(minutes.poll() - minutes.peek()));
        }

        minDiff = Math.min(minDiff, firstMinute + 1440 - (minutes.peek()));

        return minDiff;
    }

    private int toMinute(String timePoint) {
        return 60 * Integer.parseInt(timePoint.substring(0, 2)) + Integer.parseInt(timePoint.substring(3, 5));
    }
}