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

        List<Integer> nums1List = new ArrayList<>();
        List<Integer> nums2List = new ArrayList<>();

        for (int num : nums1) {
            if (!nums2Set.contains(num)) {
                nums1List.add(num);
                nums2Set.add(num);
            }
        }

        for (int num : nums2) {
            if (!nums1Set.contains(num)) {
                nums2List.add(num);
                nums1Set.add(num);
            }
        }

        return List.of(nums1List, nums2List);
    }
}