package com.vincennlin.leetcode.hashtable.easy.containsduplicateii;

import java.util.HashMap;
import java.util.Map;

//219
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndexMap.containsKey(nums[i]) && i - numIndexMap.get(nums[i]) <= k) {
                return true;
            }
            numIndexMap.put(nums[i], i);
        }

        return false;
    }
}
