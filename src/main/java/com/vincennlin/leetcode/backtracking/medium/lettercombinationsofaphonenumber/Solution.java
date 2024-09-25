package com.vincennlin.leetcode.backtracking.medium.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.List;

// 17
class Solution {
    private String[] mappings;

    public List<String> letterCombinations(String digits) {
        mappings = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> result = new ArrayList<>();
        if (!digits.isEmpty()) {
            backtracking(result, 0, new StringBuilder(), digits);
        }
        return result;
    }

    private void backtracking(List<String> result, int index, StringBuilder sb, String digits) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        for (char c : mappings[digits.charAt(index) - '0'].toCharArray()) {
            sb.append(c);
            backtracking(result, index + 1, sb, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
