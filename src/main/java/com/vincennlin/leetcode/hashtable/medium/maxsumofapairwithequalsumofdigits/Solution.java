package com.vincennlin.leetcode.hashtable.medium.maxsumofapairwithequalsumofdigits;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 2342
class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int num : nums) {
            int digitsSum = digitsSum(num);
            if (!map.containsKey(digitsSum)) {
                map.put(digitsSum, new PriorityQueue<>(Comparator.reverseOrder()));
            }
            map.get(digitsSum).add(num);
        }

        int result = -1;

        for (PriorityQueue<Integer> heap : map.values()) {
            if (heap == null || heap.size() < 2) continue;
            result = Math.max(result, heap.poll() + heap.poll());
        }

        return result;
    }

    private int digitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}