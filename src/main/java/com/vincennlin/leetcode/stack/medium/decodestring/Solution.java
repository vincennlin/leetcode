package com.vincennlin.leetcode.stack.medium.decodestring;

import java.util.ArrayDeque;
import java.util.Deque;

// 394
class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<String> stringStack = new ArrayDeque<>();
        String currentString = "";
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                k = 10 * k + Integer.parseInt(String.valueOf(c));
            } else if (Character.isLetter(c)) {
                currentString += c;
            } else if (c == '[') {
                countStack.add(k);
                k = 0;
                stringStack.add(currentString);
                currentString = "";
            } else if (c == ']') {
                int count = countStack.removeLast();
                String string = stringStack.removeLast();
                currentString = string + currentString.repeat(count);
            }
        }

        return currentString;
    }
}