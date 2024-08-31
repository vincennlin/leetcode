package com.vincennlin.leetcode.hashtable.medium.groupanagrams;

import java.util.*;

// 49
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = String.valueOf(charArray);
            List<String> anagramList = anagramMap.getOrDefault(sortedStr, new ArrayList<>());
            anagramList.add(str);
            anagramMap.put(sortedStr, anagramList);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
