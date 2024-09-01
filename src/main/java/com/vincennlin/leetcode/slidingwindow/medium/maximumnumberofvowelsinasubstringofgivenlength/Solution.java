package com.vincennlin.leetcode.slidingwindow.medium.maximumnumberofvowelsinasubstringofgivenlength;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 1456
class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        int max = 0;
        int current = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                current++;
            }
        }
        max = current;

        for (int end = k; end < s.length(); end++) {
            if (vowels.contains(s.charAt(end))) {
                current++;
            }
            if (vowels.contains(s.charAt(end - k))) {
                current--;
            }
            max = Math.max(current, max);

            if (max == k) return max;
        }

        return max;
    }
}
