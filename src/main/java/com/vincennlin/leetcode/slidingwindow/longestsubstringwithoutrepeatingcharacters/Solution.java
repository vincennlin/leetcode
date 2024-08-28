package com.vincennlin.leetcode.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

//3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int leftIndex = 0;
        int longest = 0;

        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            char c = s.charAt(rightIndex);

            if (charIndexMap.containsKey(c) && charIndexMap.get(c) >= leftIndex) {
                leftIndex = charIndexMap.get(c) + 1;
            }

            charIndexMap.put(c, rightIndex);

            longest = Math.max(longest, rightIndex - leftIndex + 1);
        }

        return longest;
    }
}
