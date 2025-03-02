package com.vincennlin.leetcode.twopointers.easy.mergetwo2darraysbysummingvalues;

import java.util.ArrayList;
import java.util.List;

// 2570
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = 0, right = 0;

        List<int[]> list = new ArrayList<>();

        while (left < nums1.length && right < nums2.length) {
            int[] indexSumPair;

            if (nums1[left][0] == nums2[right][0]) {
                indexSumPair = new int[2];
                indexSumPair[0] = nums1[left][0];
                indexSumPair[1] = nums1[left][1] + nums2[right][1];
                left++;
                right++;
            } else if (nums1[left][0] < nums2[right][0]) {
                indexSumPair = nums1[left++];
            } else {
                indexSumPair = nums2[right++];
            }

            list.add(indexSumPair);
        }

        while (left < nums1.length) {
            list.add(nums1[left++]);
        }

        while (right < nums2.length) {
            list.add(nums2[right++]);
        }

        return list.toArray(new int[][]{});
    }
}