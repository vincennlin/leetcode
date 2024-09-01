package com.vincennlin.leetcode.prefixsum.easy.findthehighestaltitude;
// 1732
class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int maxHeight = 0;

        for (int diff : gain) {
            height += diff;
            maxHeight = Math.max(height, maxHeight);
        }

        return maxHeight;
    }
}