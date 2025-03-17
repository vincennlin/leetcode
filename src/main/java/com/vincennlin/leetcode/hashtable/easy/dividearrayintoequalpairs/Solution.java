package com.vincennlin.leetcode.hashtable.easy.dividearrayintoequalpairs;

import java.util.HashSet;
import java.util.Set;

// 2206
class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }

        return set.isEmpty();
    }
}