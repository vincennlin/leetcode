package com.vincennlin.leetcode.array.medium.increasingtripletsubsequence;
// 334
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
