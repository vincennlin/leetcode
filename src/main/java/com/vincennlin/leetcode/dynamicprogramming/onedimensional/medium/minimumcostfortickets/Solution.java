package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.minimumcostfortickets;
// 983
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int maxDay = days[days.length - 1];
        int[] dp = new int[maxDay + 1];

        for (int i = 0, day = 1; day <= maxDay; day++) {
            if (day < days[i]) {
                dp[day] = dp[day - 1];
            } else {
                dp[day] = Math.min(dp[day - 1] + costs[0],
                        Math.min(dp[Math.max(0, day - 7)] + costs[1],
                                dp[Math.max(0, day - 30)] + costs[2]));

                i++;
            }
        }

        return dp[maxDay];
    }
}