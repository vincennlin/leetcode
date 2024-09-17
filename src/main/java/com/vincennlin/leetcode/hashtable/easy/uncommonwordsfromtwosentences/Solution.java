package com.vincennlin.leetcode.hashtable.easy.uncommonwordsfromtwosentences;

import java.util.*;

// 884
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> stringCountMap = new HashMap<>();
        for (String s : s1.split(" ")) {
            stringCountMap.put(s, stringCountMap.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            stringCountMap.put(s, stringCountMap.getOrDefault(s, 0) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (String str : stringCountMap.keySet()) {
            if (stringCountMap.get(str) == 1) {
                resultList.add(str);
            }
        }
        String[] resultArray = new String[resultList.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
