package com.vincennlin.leetcode.bit.medium.bitwisexorofallpairings;
// 2425
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        if (m % 2 == 0 && n % 2 == 0) {
            return 0;
        } else if (m % 2 == 0) {
            return getArrayXor(nums1);
        } else if (n % 2 == 0) {
            return getArrayXor(nums2);
        } else {
            return getArrayXor(nums1) ^ getArrayXor(nums2);
        }
    }

    private int getArrayXor(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}