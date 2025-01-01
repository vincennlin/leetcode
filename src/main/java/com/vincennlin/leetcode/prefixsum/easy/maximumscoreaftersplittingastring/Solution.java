package com.vincennlin.leetcode.prefixsum.easy.maximumscoreaftersplittingastring;
// 1422
class Solution {
    public int maxScore(String s) {
        int ones = 0;
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '1') {
                ones++;
            }
        }

        int ans = 0, zeros = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                ones--;
            } else {
                zeros++;
            }

            ans = Math.max(ans, zeros + ones);
        }

        return ans;
    }
}