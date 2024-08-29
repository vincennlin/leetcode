package com.vincennlin.leetcode.bit.easy.numberof1bits;
//191
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
