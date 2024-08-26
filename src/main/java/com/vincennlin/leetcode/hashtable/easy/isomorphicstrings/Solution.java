package com.vincennlin.leetcode.hashtable.easy.isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sToTMap.containsKey(s.charAt(i)) && sToTMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (tToSMap.containsKey(t.charAt(i)) && tToSMap.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
            sToTMap.put(s.charAt(i), t.charAt(i));
            tToSMap.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}