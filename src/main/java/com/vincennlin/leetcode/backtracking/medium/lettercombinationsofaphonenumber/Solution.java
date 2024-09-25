package com.vincennlin.leetcode.backtracking.medium.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 17
class Solution {

    Map<Integer, List<Character>> numberCharsMap;

    public Solution() {
        numberCharsMap = new HashMap<>();
        numberCharsMap.put(2, List.of('a', 'b', 'c'));
        numberCharsMap.put(3, List.of('d', 'e', 'f'));
        numberCharsMap.put(4, List.of('g', 'h', 'i'));
        numberCharsMap.put(5, List.of('j', 'k', 'l'));
        numberCharsMap.put(6, List.of('m', 'n', 'o'));
        numberCharsMap.put(7, List.of('p', 'q', 'r', 's'));
        numberCharsMap.put(8, List.of('t', 'u', 'v'));
        numberCharsMap.put(9, List.of('w', 'x', 'y', 'z'));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (!digits.isEmpty()) {
            backtracking(result, 0, "", digits);
        }
        return result;
    }

    private void backtracking(List<String> result, int index, String currentString, String digits) {
        if (index == digits.length()) {
            result.add(currentString);
            return;
        }
        for (char c : numberCharsMap.get(digits.charAt(index) - '0')) {
            backtracking(result, index + 1, currentString + c, digits);
        }
    }
}
