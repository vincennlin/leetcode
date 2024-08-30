package com.vincennlin.leetcode.backtracking.medium.combinations;

import java.util.ArrayList;
import java.util.List;

// 77
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combineHelper(result, new ArrayList<>(k), 1, n, k);
        return result;
    }

    private void combineHelper(List<List<Integer>> result, List<Integer> tempList, int start, int n, int k) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i <= n; i++) {
            tempList.add(i);
            combineHelper(result, tempList, i + 1, n, k);
            tempList.remove(tempList.size() - 1);
        }
    }
}
