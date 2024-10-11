package com.vincennlin.leetcode.heap.medium.thenumberofthesmallestunoccupiedchair;

import java.util.*;

// 1942
class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        List<int[]> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] time = times[i];
            events.add(new int[]{time[0], i});
            events.add(new int[]{time[1], ~i}); // bitwise NOT
        }
        events.sort((o1, o2) -> o1[0] - o2[0]);

        Queue<Integer> availableChairs = new PriorityQueue<>();
        Queue<int[]> occupiedChairs = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }

        for (int[] event : events) {
            int time = event[0];
            int friendIndex = event[1];

            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= time) {
                availableChairs.add(occupiedChairs.poll()[1]);
            }
            if (friendIndex >= 0) {
                int chair = availableChairs.poll();
                if (friendIndex == targetFriend) {
                    return chair;
                }
                occupiedChairs.add(new int[]{times[friendIndex][1], chair});
            }
        }

        return -1;
    }
}
