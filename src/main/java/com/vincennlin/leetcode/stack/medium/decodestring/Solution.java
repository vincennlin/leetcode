package com.vincennlin.leetcode.stack.medium.decodestring;

import java.util.ArrayDeque;
import java.util.Deque;

// 394
class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                k = 10 * k + Character.getNumericValue(c);
            } else if (Character.isLetter(c)) {
                currentString.append(c);
            } else if (c == '[') {
                countStack.push(k);
                k = 0;
                stringStack.push(currentString);
                currentString = new StringBuilder();
            } else if (c == ']') {
                int count = countStack.pop();
                StringBuilder sb = stringStack.pop();
                for (int j = 0; j < count; j++) {
                    sb.append(currentString);
                }
                currentString = sb;
            }
        }

        return currentString.toString();
    }
}