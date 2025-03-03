package com.vincennlin.leetcode.twopointers.medium.partitionarrayaccordingtogivenpivot;

import java.util.ArrayList;
import java.util.List;

// 2161
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num > pivot) {
                larger.add(num);
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < smaller.size(); i++) {
            result[i] = smaller.get(i);
        }

        for (int i = 0; i < n - smaller.size() - larger.size(); i++) {
            result[smaller.size() + i] = pivot;
        }

        for (int i = 0; i < larger.size(); i++) {
            result[n - larger.size() + i] = larger.get(i);
        }

        return result;
    }
}