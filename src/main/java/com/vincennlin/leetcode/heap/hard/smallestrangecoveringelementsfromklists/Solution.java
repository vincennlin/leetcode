package com.vincennlin.leetcode.heap.hard.smallestrangecoveringelementsfromklists;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// 632
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i).remove(0);
            minHeap.add(new int[]{num, i});
            currentMax = Math.max(currentMax, num);
        }

        int[] minRange = new int[]{minHeap.peek()[0], currentMax};

        while (!minHeap.isEmpty()) {
            int[] element = minHeap.poll();
            int currentMin = element[0];
            int listIndex = element[1];
            if (currentMax - currentMin < minRange[1] - minRange[0]) {
                minRange[0] = currentMin;
                minRange[1] = currentMax;
            }
            if (nums.get(listIndex).isEmpty()) {
                break;
            }
            int newNum = nums.get(listIndex).remove(0);
            minHeap.add(new int[]{newNum, listIndex});
            currentMax = Math.max(currentMax, newNum);
        }

        return minRange;
    }
}