package com.vincennlin.leetcode.prefixsum.medium.countvowelstringsinranges;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 2559
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));

        int[] prefixSum = new int[words.length + 1];

        for (int i = 1; i <= words.length; i++) {
            String word = words[i - 1];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                prefixSum[i] = prefixSum[i - 1] + 1;
            } else {
                prefixSum[i] = prefixSum[i - 1];
            }
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            result[i] = prefixSum[query[1] + 1] - prefixSum[query[0]];
        }

        return result;
    }
}