package com.vincennlin.leetcode.heap.medium.findkpairswithsmallestsums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//373
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) ->
                Integer.compare(nums1[a[0]] + nums2[a[1]], nums1[b[0]] + nums2[b[1]])
        );

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.add(new int[] {i, 0});
        }

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int i = curr[0], j = curr[1];
            result.add(Arrays.asList(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                minHeap.add(new int[] {i, j + 1});
            }
        }

        return result;
    }
}
