package com.vincennlin.leetcode.bit.easy.minimumbitflipstoconvertnumber;
// 2220
class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        return Integer.bitCount(xor);
    }
}