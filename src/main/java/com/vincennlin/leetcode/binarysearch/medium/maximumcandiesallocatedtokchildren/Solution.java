package com.vincennlin.leetcode.binarysearch.medium.maximumcandiesallocatedtokchildren;
// 2226
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0, right = 10000000;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canAllocate(candies, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Math.max(right, 0);
    }

    private boolean canAllocate(int[] candies, long k, int size) {
        if (size == 0) {
            return false;
        }

        long piles = 0;

        for (int candy : candies) {
            piles += candy / size;
        }

        return piles >= k;
    }
}