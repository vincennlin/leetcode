package com.vincennlin.leetcode.slidingwindow.medium.maximumsumofdistinctsubarrayswithlengthk;

import java.util.HashMap;
import java.util.Map;

// 2461
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        long val = 0;
        long max = 0;

        for (int i = 0; i < k; i++) {
            val += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            max = val;
        }

        for (int i = k; i < nums.length; i++) {
            int numToRemove = nums[i - k];
            map.put(numToRemove, map.get(numToRemove) - 1);
            if (map.get(numToRemove) == 0) {
                map.remove(numToRemove);
            }
            val -= numToRemove;

            int num = nums[i];
            val += num;
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.size() == k) {
                max = Math.max(max, val);
            }
        }

        return max;
    }
}
