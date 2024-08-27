package com.vincennlin.leetcode.hashtable.easy.romantointeger;

import java.util.HashMap;
import java.util.Map;

//13
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value = romanToIntMap.get(s.charAt(i));
            if (i < n - 1 && value < romanToIntMap.get(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }

        return sum;
    }
}
