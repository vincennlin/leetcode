package com.vincennlin.leetcode.string.medium.wordsubsets;

import java.util.ArrayList;
import java.util.List;

// 916
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];

        for (String word : words2) {
            int[] freq = getCharFreq(word);
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0 && freq[i] > maxFreq[i]) {
                    maxFreq[i] = freq[i];
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (String word : words1) {
            if (isUniversal(maxFreq, word)) {
                result.add(word);
            }
        }

        return result;
    }

    private int[] getCharFreq(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    private boolean isUniversal(int[] maxFreq, String word) {
        int[] freq = getCharFreq(word);
        for (int i = 0; i < 26; i++) {
            if (maxFreq[i] > 0 && freq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}