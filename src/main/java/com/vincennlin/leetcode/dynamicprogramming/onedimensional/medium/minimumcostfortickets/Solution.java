package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.minimumcostfortickets;
// 983
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int maxDay = days[days.length - 1];
        int[] dp = new int[maxDay + 1];
        dp[0] = 0;

        for (int i = 0, day = 1; i < days.length && day <= maxDay; day++) {
            if (days[i] == day) {
                dp[day] = dp[day - 1] + costs[0];

                if (day >= 7) {
                    dp[day] = Math.min(dp[day], dp[day - 7] + costs[1]);
                }

                if (day >= 30) {
                    dp[day] = Math.min(dp[day], dp[day - 30] + costs[2]);
                }

                i++;
            } else {
                dp[day] = dp[day - 1];
            }
        }

        return dp[maxDay];
    }
}