package com.vincennlin.leetcode.heap.medium.thenumberofthesmallestunoccupiedchair;

import java.util.*;

// 1942
class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int targetStart = times[targetFriend][0];
        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        Queue<Integer> chairs = new PriorityQueue<>();

        for (int i = 0; i < times.length; i++) {
            chairs.add(i);
        }

        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < times.length; i++) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= times[i][0]) {
                chairs.add(minHeap.poll()[1]);
            }

            if (times[i][0] == targetStart) {
                return chairs.peek();
            }

            minHeap.offer(new int[]{times[i][1], chairs.poll()});
        }

        return chairs.peek();
    }
}
