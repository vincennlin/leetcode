package com.vincennlin.leetcode.heap.medium.minimumoperationstoexceedthresholdvalueii;

import java.util.PriorityQueue;
import java.util.Queue;

// 3066
class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Long> heap = new PriorityQueue<>();

        for (int num : nums) {
            heap.add((long) num);
        }

        int result = 0;

        while (heap.size() >= 2 && heap.peek() < k) {
            long num1 = heap.poll();
            long num2 = heap.poll();
            heap.add(Math.min(num1, num2) * 2 + Math.max(num1, num2));
            result++;
        }

        return result;
    }
}