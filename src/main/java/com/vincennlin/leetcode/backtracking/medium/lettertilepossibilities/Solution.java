package com.vincennlin.leetcode.backtracking.medium.lettertilepossibilities;
// 1079
class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }

        return backtracking(freq);
    }

    private int backtracking(int[] freq) {
        int total = 0;

        for (int charIndex = 0; charIndex < 26; charIndex++) {
            if (freq[charIndex] == 0) {
                continue;
            }

            total++;
            freq[charIndex]--;
            total += backtracking(freq);
            freq[charIndex]++;
        }

        return total;
    }
}