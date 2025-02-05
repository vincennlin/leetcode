package com.vincennlin.leetcode.string.easy.checkifonestringswapcanmakestringsequal;
// 1790
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] freq = new int[26];
        int diff = 0;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                if (++diff > 2) {
                    return false;
                }
                freq[c1 - 'a']++;
                freq[c2 - 'a']--;
            }
        }

        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }

        return true;
    }
}