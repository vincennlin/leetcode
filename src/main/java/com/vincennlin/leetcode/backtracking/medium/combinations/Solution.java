package com.vincennlin.leetcode.backtracking.medium.combinations;

import java.util.ArrayList;
import java.util.List;

// 77
class Solution {
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int start, int n, int k) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i <= n; i++) {
                if (tempList.contains(i)) continue;
                tempList.add(i);
                backtrack(result, tempList, i + 1, n, k);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }
}
