package com.vincennlin.leetcode.heap.medium.divideintervalsintominimumnumberofgroups;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 2406
class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        Queue<Integer> endHeap = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (!endHeap.isEmpty() && endHeap.peek() < interval[0]) {
                endHeap.poll();
            }
            endHeap.add(interval[1]);
        }

        return endHeap.size();
    }
}
