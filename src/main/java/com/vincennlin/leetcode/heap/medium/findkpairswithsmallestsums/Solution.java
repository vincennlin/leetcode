package com.vincennlin.leetcode.heap.medium.findkpairswithsmallestsums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//373
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> pairQueue = new PriorityQueue<>(
                Comparator.comparingInt(o -> (o.get(0) + o.get(1)))
        );
        List<List<Integer>> pairList = new ArrayList<>();

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                pairQueue.add(List.of(num1, num2));
            }
        }

        for (int i = 0; i < k; i++) {
            pairList.add(pairQueue.poll());
        }

        return pairList;
    }
}
