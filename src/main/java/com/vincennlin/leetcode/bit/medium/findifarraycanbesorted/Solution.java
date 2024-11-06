package com.vincennlin.leetcode.bit.medium.findifarraycanbesorted;
// 3011
class Solution {
    public boolean canSortArray(int[] nums) {
        byte prevBit = 0;
        int prevMax = 0, curMin = 0, curMax = 0;

        for (int num : nums) {
            byte curBit = (byte) Integer.bitCount(num);

            if (prevBit == curBit) {
                curMin = Math.min(curMin, num);
                curMax = Math.max(curMax, num);
            } else if (curMin < prevMax) {
                return false;
            } else {
                prevMax = curMax;
                curMin = curMax = num;
                prevBit = curBit;
            }
        }
        return curMin > prevMax;
    }
}
