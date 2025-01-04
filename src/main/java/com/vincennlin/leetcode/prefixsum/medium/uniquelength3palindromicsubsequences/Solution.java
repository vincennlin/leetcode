package com.vincennlin.leetcode.prefixsum.medium.uniquelength3palindromicsubsequences;

import java.util.*;

// 1930
class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] leftIndexes = new int[26];
        int[] rightIndexes = new int[26];
        Arrays.fill(leftIndexes, -1);

        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if (leftIndexes[charIndex] == -1) {
                leftIndexes[charIndex] = i;
            }
            rightIndexes[charIndex] = i;
        }

        int answer = 0;

        for (int left = 0; left < s.length(); left++) {
            int charIndex = s.charAt(left) - 'a';

            if (leftIndexes[charIndex] == -1) {
                continue;
            }

            int right = rightIndexes[charIndex];

            if (right - left > 1) {
                answer += getLength3PalindromeCount(left + 1, right - 1, s);
            }

            leftIndexes[charIndex] = -1;
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