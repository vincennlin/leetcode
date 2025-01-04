package com.vincennlin.leetcode.prefixsum.medium.uniquelength3palindromicsubsequences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1930
class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> leftSet = new HashSet<>();
        Map<Character, Integer> rightMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            leftSet.add(c);
            rightMap.put(c, i);
        }

        int answer = 0;

        for (int left = 0; left < s.length(); left++) {
            char c = s.charAt(left);
            if (leftSet.contains(c)) {
                int right = rightMap.get(c);
                if (right - left > 1) {
                    answer += getLength3PalindromeCount(left + 1, right - 1, s);
                }
                leftSet.remove(c);
            }
        }

        return answer;
    }

    private int getLength3PalindromeCount(int left, int right, String s) {
        boolean[] middleCharacters = new boolean[26];
        int result = 0;

        for (int index = left; index <= right; index++) {
            char middleChar = s.charAt(index);
            if (!middleCharacters[middleChar - 'a']) {
                result++;
                middleCharacters[middleChar - 'a'] = true;
            }
        }

        return result;
    }
}