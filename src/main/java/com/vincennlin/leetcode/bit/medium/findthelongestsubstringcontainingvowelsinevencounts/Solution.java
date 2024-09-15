package com.vincennlin.leetcode.bit.medium.findthelongestsubstringcontainingvowelsinevencounts;

import java.util.HashMap;
import java.util.Map;

// 1371
class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Character, Integer> vowelOrderMap = new HashMap<>();
        vowelOrderMap.put('a', 0);
        vowelOrderMap.put('e', 1);
        vowelOrderMap.put('i', 2);
        vowelOrderMap.put('o', 3);
        vowelOrderMap.put('u', 4);

        Map<Integer, Integer> bitIndexMap = new HashMap<>();
        bitIndexMap.put(0, -1);

        int bit = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowelOrderMap.containsKey(c)) {
                bit ^= (1 << vowelOrderMap.get(c));
            }
            if (bitIndexMap.containsKey(bit)) {
                maxLength = Math.max(maxLength, i - bitIndexMap.get(bit));
            } else {
                bitIndexMap.put(bit, i);
            }
        }

        return maxLength;
    }
}
