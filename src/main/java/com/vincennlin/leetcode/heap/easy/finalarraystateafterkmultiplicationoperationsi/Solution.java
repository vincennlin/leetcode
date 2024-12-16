package com.vincennlin.leetcode.heap.easy.finalarraystateafterkmultiplicationoperationsi;

import java.util.PriorityQueue;
import java.util.Queue;

// 3264
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            minHeap.add(new int[]{nums[i], i});
        }

        while (k-- > 0) {
            int[] element = minHeap.poll();
            element[0] *= multiplier;
            nums[element[1]] = element[0];
            minHeap.add(element);
        }

        return nums;
    }
}