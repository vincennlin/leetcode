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

        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();

        for (int i = 0; i < patternChar.length; i++) {
            if (charToWordMap.containsKey(patternChar[i]) && (!charToWordMap.get(patternChar[i]).equals(words[i]))) {
                return false;
            } else if (wordToCharMap.containsKey(words[i]) && (!wordToCharMap.get(words[i]).equals(patternChar[i]))) {
                return false;
            }
            charToWordMap.put(patternChar[i], words[i]);
            wordToCharMap.put(words[i], patternChar[i]);
        }

        return true;
    }
}