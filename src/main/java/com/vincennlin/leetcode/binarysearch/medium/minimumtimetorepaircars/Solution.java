package com.vincennlin.leetcode.binarysearch.medium.minimumtimetorepaircars;
// 2594
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = (long) ranks[0] * cars * cars;
        long mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canRepair(ranks, cars, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canRepair(int[] ranks, int cars, long time) {
        long totalCars = 0;

        for (int rank : ranks) {
            long carsCanRepair = (long) Math.sqrt((double) time / rank);
            totalCars += carsCanRepair;
        }

        return totalCars >= cars;
    }
}