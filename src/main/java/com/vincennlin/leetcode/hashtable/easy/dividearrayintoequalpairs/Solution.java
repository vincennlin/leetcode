package com.vincennlin.leetcode.hashtable.easy.dividearrayintoequalpairs;
// 2206
class Solution {
    public boolean divideArray(int[] nums) {
        int bit = 0;

        for (int num : nums) {
            bit ^= num;
        }

        return bit == 0;
    }
}