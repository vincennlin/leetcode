package com.vincennlin.leetcode.bit.medium.minimumarrayend;
// 3133
class Solution {
    public long minEnd(int n, int x) {
        n--;
        long result = x;

        for (long bit = 1; n > 0; bit <<= 1) {
            if ((x & bit) == 0) {
                result |= (n & 1) * bit;
                n >>= 1;
            }
        }

        return result;
    }
}