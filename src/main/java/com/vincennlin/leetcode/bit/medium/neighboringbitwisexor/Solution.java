package com.vincennlin.leetcode.bit.medium.neighboringbitwisexor;
// 2683
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int num : derived) {
            xor ^= num;
        }
        return xor == 0;
    }
}