package com.vincennlin.leetcode.array.medium.gasstation;
//134
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            if (gas[i] < cost[i]) continue;
            int currentTank = 0;
            for (int j = i; j < i + n; j++) {
                j = j % n;
                currentTank = currentTank + gas[j] - cost[j];
                if (currentTank >= 0 && (j == (i + n - 1) % n)) {
                    return i;
                } else if (currentTank < 0) {
                    break;
                }
            }
        }
        return -1;
    }
}
