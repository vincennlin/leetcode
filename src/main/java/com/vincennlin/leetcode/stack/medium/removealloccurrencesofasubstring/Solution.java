package com.vincennlin.leetcode.stack.medium.removealloccurrencesofasubstring;

import java.util.Deque;
import java.util.LinkedList;

// 1910
class Solution {
    public String removeOccurrences(String s, String part) {
        int n = part.length();

        if (n > s.length()) {
            return s;
        }

        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
            if (stack.size() >= n && checkMatch(stack, part, n)) {
                for (int i = 0; i < n; i++) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }

        return sb.toString();
    }

    private boolean checkMatch(Deque<Character> stack, String part, int n) {
        Deque<Character> tempStack = new LinkedList<>();
        tempStack.addAll(stack);

        for (int index = n - 1; index >= 0; index--) {
            if (tempStack.peek() != part.charAt(index)) {
                return false;
            } else {
                tempStack.pop();
            }
        }

        return true;
    }
}