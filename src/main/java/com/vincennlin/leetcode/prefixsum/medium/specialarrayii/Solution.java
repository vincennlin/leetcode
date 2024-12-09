package com.vincennlin.leetcode.prefixsum.medium.specialarrayii;

import java.util.ArrayList;
import java.util.List;

// 3152
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        List<int[]> specialArrayIndexes = new ArrayList<>();

        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2 && i - start > 1) {
                specialArrayIndexes.add(new int[]{start, i - 1});
                start = i;
            }
        }
        if (start != nums.length - 1) {
            specialArrayIndexes.add(new int[]{start, nums.length - 1});
        }

        boolean[] result = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int index = binarySearch(specialArrayIndexes, query[0]);
            result[i] = query[1] <= specialArrayIndexes.get(index)[1];
        }

        return result;
    }

    private int binarySearch(List<int[]> specialArrayIndexes, int target) {
        int left = 0, right = specialArrayIndexes.size() - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target < specialArrayIndexes.get(mid)[0]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}