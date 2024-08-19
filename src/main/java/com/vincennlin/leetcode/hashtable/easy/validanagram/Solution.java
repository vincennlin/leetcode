package com.vincennlin.leetcode.hashtable.easy.validanagram;

import java.util.HashMap;
import java.util.Map;

//242
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            } else {
                map.put(c, count - 1);
            }
        }
        return true;
    }
}
