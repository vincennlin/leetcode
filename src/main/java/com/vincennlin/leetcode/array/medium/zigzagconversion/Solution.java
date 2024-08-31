package com.vincennlin.leetcode.array.medium.zigzagconversion;

import java.util.ArrayList;
import java.util.List;

// 6
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean isDown = true;

        for (int i = 0; i < s.length(); i++) {
            rows.get(currentRow).append(s.charAt(i));
            if (currentRow == numRows - 1) {
                isDown = false;
            } else if (currentRow == 0) {
                isDown = true;
            }
            currentRow += isDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows.get(i));
        }

        return result.toString();
    }
}