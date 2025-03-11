package com.vincennlin.leetcode.slidingwindow.medium.numberofsubstringscontainingallthreecharacters;
// 1358
class Solution {
    public int numberOfSubstrings(String s) {
        int result = 0;
        int[] lastPos = {-1, -1, -1};

        for (int pos = 0; pos < s.length(); pos++) {
            lastPos[s.charAt(pos) - 'a'] = pos;

            result += 1 + Math.min(Math.min(lastPos[0], lastPos[1]), lastPos[2]);
        }

        return result;
    }
}