package com.vincennlin.leetcode.math.medium.counttotalnumberofcoloredcells;
// 2579
class Solution {
    public long coloredCells(int n) {
        return ((long) n * (long) n) + ((long) (n - 1) * (long) (n - 1));
    }
}