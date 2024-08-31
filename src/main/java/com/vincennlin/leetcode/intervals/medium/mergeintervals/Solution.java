package com.vincennlin.leetcode.intervals.medium.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;

//56
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int lastMergedIndex = 0;

        for (int i = 1; i < intervals.length ; i++) {
            if (intervals[lastMergedIndex][1] >= intervals[i][0]) {
                intervals[lastMergedIndex][1] = Math.max(intervals[lastMergedIndex][1], intervals[i][1]);
            } else {
                lastMergedIndex++;
                intervals[lastMergedIndex] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, lastMergedIndex + 1);
    }
}
