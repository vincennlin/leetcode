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

        boolean[] isOdd = new boolean[26];
        int oddCount = 0;

        for (char c : s.toCharArray()) {
            if (isOdd[c - 'a']) {
                oddCount--;
            } else {
                oddCount++;
            }
            isOdd[c - 'a'] = !isOdd[c - 'a'];
        }

        return oddCount <= k;
    }
}