package com.vincennlin.leetcode.stack.medium.constructsmallestnumberfromdistring;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// 2375
class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new LinkedList<>();
        int num = 1;

        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(num++);

            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        return sb.toString();
    }
}
