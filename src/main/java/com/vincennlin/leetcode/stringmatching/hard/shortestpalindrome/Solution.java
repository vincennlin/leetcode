package com.vincennlin.leetcode.stringmatching.hard.shortestpalindrome;
// 214
class Solution {
    public String shortestPalindrome(String s) {
        String sReverse = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + sReverse;

        int m = combined.length();
        int[] lps = new int[m];

        int len = 0;
        for (int i = 1; i < m; i++) {
            if (combined.charAt(i) == combined.charAt(len)) {
                len++;
                lps[i] = len;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                    i--;
                } else {
                    lps[i] = 0;
                }
            }
        }

        String prefix = sReverse.substring(0, s.length() - lps[m - 1]);
        return prefix + s;
    }
}
