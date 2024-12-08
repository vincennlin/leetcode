package com.vincennlin.leetcode.greedy.medium.twobestnonoverlappingevents;

import java.util.ArrayList;
import java.util.List;

// 2054
class Solution {
    public int maxTwoEvents(int[][] events) {
        List<int[]> times = new ArrayList<>();

        for (int[] event : events) {
            // time[1] == 1 -> start
            times.add(new int[]{event[0], 1, event[2]});
            // time[1] == 0 -> end
            times.add(new int[]{event[1] + 1, 0, event[2]});
        }

        times.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        int ans = 0, maxValue = 0;

        for (int[] time : times) {
            if (time[1] == 1) { // start
                ans = Math.max(ans, time[2] + maxValue);
            } else { // end
                maxValue = Math.max(maxValue, time[2]);
            }
        }

        return ans;
    }
}
