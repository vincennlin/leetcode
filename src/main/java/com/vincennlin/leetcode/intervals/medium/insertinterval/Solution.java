package com.vincennlin.leetcode.intervals.medium.insertinterval;

import java.util.ArrayList;
import java.util.List;

// 57
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultList = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            resultList.add(intervals[i++]);
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        resultList.add(newInterval);

        while (i < n) {
            resultList.add(intervals[i++]);
        }

        int[][] result = new int[resultList.size()][2];
        return resultList.toArray(result);
    }
}