package com.vincennlin.leetcode.heap.medium.constructstringwithrepeatlimit;

import java.util.*;

// 2182
class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        Queue<Character> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int[] chars = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (chars[c - 'a'] == 0) {
                maxHeap.add(c);
            }
            chars[c - 'a']++;
        }

        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int charIndex = c - 'a';
            sb.append(c);
            chars[charIndex]--;
            while (chars[charIndex]-- > 0) {
                if (sb.length() > repeatLimit && sb.charAt(sb.length() - repeatLimit) == c) {
                    if (maxHeap.isEmpty()) {
                        break;
                    }
                    char nextChar = maxHeap.peek();
                    sb.append(nextChar);
                    chars[nextChar - 'a']--;
                } else {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}