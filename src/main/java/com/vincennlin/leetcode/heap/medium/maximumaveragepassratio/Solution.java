package com.vincennlin.leetcode.heap.medium.maximumaveragepassratio;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 1792
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        Queue<int[]> heap = new PriorityQueue<>((a, b) -> Double.compare(
                (((double) (b[0] + 1) / (double) (b[1] + 1)) - (((double) b[0]) / ((double) b[1]))),
                (((double) (a[0] + 1) / (double) (a[1] + 1)) - (((double) a[0]) / ((double) a[1])))));

        heap.addAll(Arrays.asList(classes));

        for (int i = 0; i < extraStudents; i++) {
            int[] cla = heap.poll();
            cla[0]++;
            cla[1]++;
            heap.add(cla);
        }

        double result = 0;

        for (int[] cla : heap) {
            result += ((double) cla[0]) / ((double) cla[1]);
        }

        return result / classes.length;
    }
}