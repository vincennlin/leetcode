package com.vincennlin.leetcode.stack.medium.removingstarsfromastring;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// 2390
class Solution {
    public String removeStars(String s) {
        Deque<Character> charDeque = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                charDeque.addLast(c);
            } else {
                charDeque.removeLast();
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : charDeque) {
            result.append(c);
        }

        return result.toString();
    }
}