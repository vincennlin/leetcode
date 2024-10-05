package com.vincennlin.leetcode.hashtable.medium.permutationinstring;

import java.util.Arrays;

// 567
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n - m; i++) {
            if (Arrays.compare(s1Freq, s2Freq) == 0) {
                return true;
            }
            s2Freq[s2.charAt(i) - 'a']--;
            s2Freq[s2.charAt(i + m) - 'a']++;
        }

        return Arrays.compare(s1Freq, s2Freq) == 0;
    }
}
