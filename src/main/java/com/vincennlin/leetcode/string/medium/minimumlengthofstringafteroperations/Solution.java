package com.vincennlin.leetcode.string.medium.minimumlengthofstringafteroperations;
// 3223
class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int ans = 0;

        for (int f : freq) {
            if (f == 0) {
                continue;
            }
            if (f % 2 == 1) {
                ans += 1;
            } else {
                ans += 2;
            }
        }

        return ans;
    }
}