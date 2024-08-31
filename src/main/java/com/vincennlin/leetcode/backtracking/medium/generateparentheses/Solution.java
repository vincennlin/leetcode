package com.vincennlin.leetcode.backtracking.medium.generateparentheses;

import java.util.ArrayList;
import java.util.List;

// 22
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(result, "", 0, 0, n);
        return result;
    }

    private void backtracking(List<String> result, String tempString, int open, int close, int max) {
        if (tempString.length() == max * 2) {
            result.add(tempString);
            return;
        }

        if (open < max) {
            backtracking(result, tempString + "(", open + 1, close, max);
        }

        if (close < open) {
            backtracking(result, tempString + ")", open, close + 1, max);
        }
    }
}
