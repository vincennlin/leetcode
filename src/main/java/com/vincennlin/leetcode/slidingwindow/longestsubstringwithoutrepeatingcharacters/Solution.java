package com.vincennlin.leetcode.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

//3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftIndex = 0, rightIndex = 0;
        Set<Character> charSet = new HashSet<>();
        int longest = 0;

        while (rightIndex < s.length()) {
            while (charSet.contains(s.charAt(rightIndex))) {
                charSet.remove(s.charAt(leftIndex));
                leftIndex++;
            }
            charSet.add(s.charAt(rightIndex));
            rightIndex++;
            longest = Math.max(rightIndex - leftIndex, longest);
        }
        return longest;
    }
}
