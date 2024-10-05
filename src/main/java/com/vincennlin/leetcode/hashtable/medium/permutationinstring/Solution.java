package com.vincennlin.leetcode.hashtable.medium.permutationinstring;

import java.util.Arrays;

// 567
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] zeroArray = new int[26];
        int[] freq = new int[26];
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            Arrays.fill(freq, 0);
            for (int j = i; j < i + s1.length(); j++) {
                freq[s2.charAt(j) - 'a']++;
            }

            for (char c1 : s1.toCharArray()) {
                --freq[c1 - 'a'];
            }

            if (Arrays.compare(freq, zeroArray) == 0) {
                return true;
            }
        }

        return false;
    }
}
