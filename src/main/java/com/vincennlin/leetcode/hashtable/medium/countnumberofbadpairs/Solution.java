package com.vincennlin.leetcode.hashtable.medium.countnumberofbadpairs;

import java.util.HashMap;
import java.util.Map;

// 2364
class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = i - nums[i];
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        long result = (long) nums.length * (nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            int num = i - nums[i];
            result -= (numCountMap.get(num) - 1);
        }

        return result / 2;
    }
}
