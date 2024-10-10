package com.vincennlin.leetcode.monotonicstack.medium.maximumwidthramp;

import java.util.ArrayDeque;
import java.util.Deque;

// 962
class Solution {
    public int maxWidthRamp(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (stack.isEmpty() || nums[stack.peek()] > num) {
                stack.push(i);
            }
            if (num == 0) break;
        }

        int maxWidth = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (!stack.isEmpty() && num >= nums[stack.peek()]) {
                maxWidth = Math.max(maxWidth, i - stack.pop());
            }
        }

        return maxWidth;
    }
}