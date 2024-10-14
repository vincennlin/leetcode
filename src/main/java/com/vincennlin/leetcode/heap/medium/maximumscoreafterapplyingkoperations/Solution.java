package com.vincennlin.leetcode.heap.medium.maximumscoreafterapplyingkoperations;

import java.util.PriorityQueue;
import java.util.Queue;

// 2530
class Solution {
    public long maxKelements(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.add(num);
        }

        long score = 0;

        for (int i = 0; i < k; i++) {
            int increase = maxHeap.poll();
            score += increase;
            maxHeap.add((int) Math.ceil(((double) increase) / 3));
        }

        return score;
    }
}
