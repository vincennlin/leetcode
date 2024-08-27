package com.vincennlin.leetcode.array.medium.gasstation;
//134
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int gasDiff = gas[i] - cost[i];
            currentTank = currentTank + gasDiff;
            totalTank += gasDiff;

            if (currentTank < 0) {
                startStation = i + 1;
                currentTank = 0;
            }
        }

        return totalTank >= 0 ? startStation : -1;
    }
}
