package com.vincennlin.leetcode.array.medium.stringcompression;
// 443
class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int write = 0, start = 0;
        while (start < chars.length) {
            char currentChar = chars[start];
            int end = start;

            while (end < chars.length && chars[end] == currentChar) {
                end++;
            }

            int length = end - start;

            chars[write++] = currentChar;
            if (length > 1) {
                for (char c : String.valueOf(length).toCharArray()) {
                    chars[write++] = c;
                }
            }

            start = end;
        }

        return write;
    }
}