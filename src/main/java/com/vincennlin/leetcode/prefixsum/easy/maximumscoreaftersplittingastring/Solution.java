package com.vincennlin.leetcode.prefixsum.easy.maximumscoreaftersplittingastring;
// 1422
class Solution {
    public int maxScore(String s) {
        int[] prefixOnes = new int[s.length()];
        prefixOnes[0] = s.charAt(0) == 1 ? 1 : 0;

        for (int i = 1; i < s.length(); i++) {
            prefixOnes[i] = prefixOnes[i - 1] + (s.charAt(i) == '1' ? 1 : 0);
        }

        int ans = 0, zeroCount = 0;

        for (int i = 0; i < s.length(); i++) {
            zeroCount += (s.charAt(i) == '0' ? 1 : 0);
            ans = Math.max(ans, zeroCount + (prefixOnes[prefixOnes.length - 1] - prefixOnes[i]));
        }

        return ans;
    }
}