package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.wordbreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//139
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                if (s.startsWith(word, i - word.length()) && dp[i - word.length()]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
