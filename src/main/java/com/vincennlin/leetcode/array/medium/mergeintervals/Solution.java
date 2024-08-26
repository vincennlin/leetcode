package com.vincennlin.leetcode.array.medium.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;

//56
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int mergedIndex = 0;

        for (int i = 1; i < intervals.length ; i++) {
            if (intervals[mergedIndex][1] >= intervals[i][0]) {
                if (intervals[mergedIndex][1] < intervals[i][1]) {
                    intervals[mergedIndex][1] = intervals[i][1];
                }
            } else {
                intervals[mergedIndex+1] = intervals[i];
                mergedIndex++;
            }
        }

        return Arrays.copyOf(intervals, mergedIndex + 1);
    }
}
