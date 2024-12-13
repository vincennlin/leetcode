package com.vincennlin.leetcode.heap.medium.findscoreofanarrayaftermarkingallelements;

import java.util.PriorityQueue;
import java.util.Queue;

// 2593
class Solution {
    public long findScore(int[] nums) {
        boolean[] marked = new boolean[nums.length];
        long ans = 0;

        Queue<int[]> heap = new PriorityQueue<>((a, b) ->
                a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            heap.add(new int[]{nums[i], i});
        }

        while (!heap.isEmpty()) {
            int[] element = heap.poll();
            if (!marked[element[1]]) {
                int num = element[0];
                int index = element[1];
                ans += num;
                marked[index] = true;
                if (index > 0) {
                    marked[index - 1] = true;
                }
                if (index < nums.length - 1) {
                    marked[index + 1] = true;
                }
            }
        }

        return ans;
    }
}