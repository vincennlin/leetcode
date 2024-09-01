package com.vincennlin.leetcode.hashtable.easy.uniquenumberofoccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1207
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numOccurrenceMap = new HashMap<>();

        for (int num : arr) {
            numOccurrenceMap.put(num, numOccurrenceMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrenceSet = new HashSet<>(numOccurrenceMap.values());

        return occurrenceSet.size() == numOccurrenceMap.size();
    }
}
