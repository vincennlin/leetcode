package com.vincennlin.leetcode.twopointer.medium.threesum;

import java.util.*;

//15
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> indexNumMap = new HashMap<>();
        Map<Integer, List<Integer>> numIndexMap = new HashMap<>();

        Set<List<Integer>> returnNumSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            indexNumMap.put(i, nums[i]);
            List<Integer> indexes = numIndexMap.getOrDefault(nums[i], new ArrayList<>());
            indexes.add(i);
            numIndexMap.put(nums[i], indexes);
        }

        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (numIndexMap.containsKey(target - nums[j])) {
                    List<Integer> indexes = numIndexMap.get(target - nums[j]);
                    for (int index : indexes) {
                        returnNumSet.add(List.of(nums[i], nums[j], indexNumMap.get(index)));
                    }
                }
            }
        }

        return new ArrayList<>(returnNumSet);
    }
}
