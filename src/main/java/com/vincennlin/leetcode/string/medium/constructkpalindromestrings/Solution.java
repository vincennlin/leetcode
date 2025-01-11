package com.vincennlin.leetcode.string.medium.constructkpalindromestrings;

// 1400
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        if (s.length() == k) {
            return true;
        }

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;

        for (int f : freq) {
            if (f % 2 == 1) {
                oddCount++;
            }
        }

        return oddCount <= k;
    }
}