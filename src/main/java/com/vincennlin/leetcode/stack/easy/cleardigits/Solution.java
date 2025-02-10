package com.vincennlin.leetcode.stack.easy.cleardigits;

import java.util.Deque;
import java.util.LinkedList;

// 3174
class Solution {
    public String clearDigits(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }

        return sb.toString();
    }
}