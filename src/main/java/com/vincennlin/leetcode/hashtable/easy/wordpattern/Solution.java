package com.vincennlin.leetcode.hashtable.easy.wordpattern;

import java.util.HashMap;
import java.util.Map;

//290
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternChar = pattern.toCharArray();
        String[] words = s.split(" ");
        if (patternChar.length == 0 || words.length == 0 || patternChar.length != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < patternChar.length; i++) {
            if (map.containsKey(patternChar[i]) && (!map.get(patternChar[i]).equals(words[i]))) {
                return false;
            } else if (!map.containsKey(patternChar[i]) && map.containsValue(words[i])){
                return false;
            } else {
                map.put(patternChar[i], words[i]);
            }
        }

        return true;
    }
}