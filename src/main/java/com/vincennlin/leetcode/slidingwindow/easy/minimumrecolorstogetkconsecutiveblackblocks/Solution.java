package com.vincennlin.leetcode.slidingwindow.easy.minimumrecolorstogetkconsecutiveblackblocks;
// 2379
// todo
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int recolor = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                recolor++;
            }
        }

        int minRecolor = recolor;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                recolor++;
            }
            if (blocks.charAt(i - k) == 'B') {
                recolor--;
            }

            minRecolor = Math.min(minRecolor, recolor);
        }

        return Math.max(0, minRecolor);
    }
}
