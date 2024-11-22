package com.vincennlin.leetcode.matrix.medium.flipcolumnsformaximumnumberofequalrows;

import java.util.HashMap;
import java.util.Map;

// 1072
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> rowCountMap = new HashMap<>();

        for (int[] row : matrix) {
            StringBuilder sb = new StringBuilder();
            for (int num : row) {
                sb.append(num == row[0] ? 'T' : 'F');
            }
            String rowPattern = sb.toString();
            rowCountMap.put(rowPattern, rowCountMap.getOrDefault(rowPattern, 0) + 1);
        }

        return rowCountMap.values().stream().max(Integer::compareTo).get();
    }
}
