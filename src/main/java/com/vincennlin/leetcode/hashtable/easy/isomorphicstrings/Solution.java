package com.vincennlin.leetcode.hashtable.easy.isomorphicstrings;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sToTMap = new int[256];
        int[] tToSMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToTMap[sChar] == 0 && tToSMap[tChar] == 0) {
                sToTMap[sChar] = tChar;
                tToSMap[tChar] = sChar;
            } else if (sToTMap[sChar] != tChar || tToSMap[tChar] != sChar) {
                return false;
            }
        }

        return true;
    }
}