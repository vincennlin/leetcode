package com.vincennlin.leetcode.twopointers.medium.separateblackandwhiteballs;
// 2938
class Solution {
    public long minimumSteps(String s) {
        long totalSwaps = 0;
        int blackBallCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                totalSwaps += blackBallCount;
            } else {
                blackBallCount++;
            }
        }

        return totalSwaps;
    }
}
