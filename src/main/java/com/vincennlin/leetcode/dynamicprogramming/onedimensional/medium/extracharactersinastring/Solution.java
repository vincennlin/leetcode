package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.extracharactersinastring;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 2707
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int m = s.length();

        Set<String> stringSet = new HashSet<>();
        Collections.addAll(stringSet, dictionary);

        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < i; j++) {
                String subString = s.substring(j, i);
                if (stringSet.contains(subString)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                } else {
                    dp[i] = Math.min(dp[i], dp[j] + i - j);
                }
            }
        }

        return dp[m];
    }
}