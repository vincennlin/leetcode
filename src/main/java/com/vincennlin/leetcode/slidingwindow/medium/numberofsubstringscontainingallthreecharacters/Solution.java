package com.vincennlin.leetcode.slidingwindow.medium.numberofsubstringscontainingallthreecharacters;

import java.util.HashMap;
import java.util.Map;

// 1358
class Solution {
    public int numberOfSubstrings(String s) {
        int result = 0;

        Map<Character, Integer> charFreqMap = new HashMap<>();
        int start = 0, end = 0;

        while (end < s.length()) {
            char endChar = s.charAt(end);

            charFreqMap.put(endChar, charFreqMap.getOrDefault(endChar, 0) + 1);

            while (charFreqMap.size() == 3) {
                result += s.length() - end;
                char startChar = s.charAt(start);

                charFreqMap.put(startChar, charFreqMap.get(startChar) - 1);
                if (charFreqMap.get(startChar) == 0) {
                    charFreqMap.remove(startChar);
                }

                start++;
            }

            end++;
        }

        return result;
    }
}