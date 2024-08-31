package com.vincennlin.leetcode.backtracking.medium.combinationsum;

import java.util.ArrayList;
import java.util.List;

// 39
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, 0, target, candidates);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int start, int currentSum, int target, int[] candidates) {
        if (currentSum == target) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (currentSum + candidates[i] > target) continue;
            tempList.add(candidates[i]);
            backtrack(result, tempList, i, currentSum + candidates[i], target, candidates);
            tempList.remove(tempList.size() - 1);
        }
    }
}
