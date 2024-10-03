package com.vincennlin.leetcode.prefixsum.medium.makesumdivisblebyp;

import java.util.HashMap;
import java.util.Map;

// 1590
class Solution {
    public int minSubarray(int[] nums, int p) {
        int m = nums.length;
        int target = 0;
        for (int num : nums) {
            target = (target + num) % p;
        }

        if (target == 0) {
            return 0;
        }

        Map<Integer, Integer> prefixModIndex = new HashMap<>();
        prefixModIndex.put(0, -1);

        int currentMod = 0;
        int minLength = m;

        for (int i = 0; i < m; i++) {
            currentMod = (currentMod + nums[i]) % p;

            int neededMod = (currentMod - target + p) % p;
            if (prefixModIndex.containsKey(neededMod)) {
                minLength = Math.min(minLength, i - prefixModIndex.get(neededMod));
            }

            prefixModIndex.put(currentMod, i);
        }

        return minLength == m ? -1 : minLength;
    }
}
