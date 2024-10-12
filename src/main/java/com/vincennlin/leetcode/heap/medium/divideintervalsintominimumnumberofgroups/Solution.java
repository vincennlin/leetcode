package com.vincennlin.leetcode.heap.medium.divideintervalsintominimumnumberofgroups;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 2406
class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        Queue<Integer> endHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (!endHeap.isEmpty() && endHeap.peek() < start) {
                endHeap.poll();
            }
            endHeap.add(end);
        }

        return endHeap.size();
    }
}
