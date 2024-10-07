package com.vincennlin.leetcode.stack.medium.minimumstringlengthafterremovingsubstrings;

import java.util.ArrayDeque;
import java.util.Deque;

// 2696
class Solution {
    public int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
            boolean operation = true;
            while (stack.size() > 1 && operation) {
                char top = stack.pop();
                if ((stack.peek() == 'A' && top == 'B') || (stack.peek() == 'C' && top == 'D')) {
                    stack.pop();
                } else {
                    stack.push(top);
                    operation = false;
                }
            }
        }
        return stack.size();
    }
}