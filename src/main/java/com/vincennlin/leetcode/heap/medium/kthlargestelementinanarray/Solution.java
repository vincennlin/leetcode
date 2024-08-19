package com.vincennlin.leetcode.heap.medium.kthlargestelementinanarray;

import java.util.PriorityQueue;
//215
class Solution {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        }

        return minHeap.peek();
    }
}