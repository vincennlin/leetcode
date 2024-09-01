package com.vincennlin.leetcode.hashtable.easy.findthedifferenceoftwoarrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 2215
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int num : nums1) {
            nums1Set.add(num);
        }

        for (int num : nums2) {
            nums2Set.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (int num : nums1Set) {
            if (!nums2Set.contains(num)) {
                result.get(0).add(num);
            }
        }

        for (int num : nums2Set) {
            if (!nums1Set.contains(num)) {
                result.get(1).add(num);
            }
        }

        return result;
    }
}