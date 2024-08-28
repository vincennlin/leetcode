package com.vincennlin.leetcode.matrix;

import java.util.HashSet;
import java.util.Set;

//36
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int size = 9;
        Set<Character>[] rows = new HashSet[size];
        Set<Character>[] cols = new HashSet[size];
        Set<Character>[] boxes = new HashSet[size];

        for (int i = 0; i < size; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int k = 3 * (i / 3) + (j / 3);
                if (rows[i].contains(c) || cols[j].contains(c) || boxes[k].contains(c)) {
                    return false;
                } else {
                    rows[i].add(c);
                    cols[j].add(c);
                    boxes[k].add(c);
                }
            }
        }

        return true;
    }
}
