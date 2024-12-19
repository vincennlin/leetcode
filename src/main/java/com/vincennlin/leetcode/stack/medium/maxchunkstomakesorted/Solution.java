package com.vincennlin.leetcode.stack.medium.maxchunkstomakesorted;

import java.util.ArrayDeque;
import java.util.Deque;

// 769
class Solution {
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : arr) {
            if (stack.isEmpty() || num > stack.peek()) {
                stack.push(num);
            } else {
                int largest = stack.pop();
                while (!stack.isEmpty() && num < stack.peek()) {
                    stack.pop();
                }
                stack.push(largest);
            }
        }

        return stack.size();
    }
}