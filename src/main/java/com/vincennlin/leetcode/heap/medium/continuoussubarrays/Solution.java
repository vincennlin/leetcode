package com.vincennlin.leetcode.heap.medium.continuoussubarrays;

import java.util.PriorityQueue;
import java.util.Queue;

// 2762
class Solution {
    public long continuousSubarrays(int[] nums) {
        int left = 0, right = 0;
        long count = 0;

        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> nums[a] - nums[b]);

        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);

        while (right < nums.length) {
            minHeap.add(right);
            maxHeap.add(right);

            while (left < right && nums[maxHeap.peek()] - nums[minHeap.peek()] > 2) {
                left++;

                while (!maxHeap.isEmpty() && maxHeap.peek() < left) {
                    maxHeap.poll();
                }
                while (!minHeap.isEmpty() && minHeap.peek() < left) {
                    minHeap.poll();
                }
            }

            count += right - left + 1;
            right++;
        }

        return count;
    }
}