package com.vincennlin.leetcode.slidingwindow.medium.maximumnumberofvowelsinasubstringofgivenlength;
// 1456
class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int current = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                current++;
            }
        }
        max = current;

        for (int end = k; end < n; end++) {
            if (isVowel(s.charAt(end))) {
                current++;
            }
            if (isVowel(s.charAt(end - k))) {
                current--;
            }
            max = Math.max(current, max);

            if (max == k) return max;
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
