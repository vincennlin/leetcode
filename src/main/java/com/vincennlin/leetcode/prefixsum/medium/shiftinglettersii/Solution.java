package com.vincennlin.leetcode.prefixsum.medium.shiftinglettersii;
// 2381
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] shiftSums = new int[s.length()];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            for (int i = start; i <= end; i++) {
                shiftSums[i] += direction == 1 ? 1 : -1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < shiftSums.length; i++) {
            int charIndex = ((s.charAt(i) + shiftSums[i] - 'a') + 26 * (10 ^ 4)) % 26;
            sb.append((char) ('a' + charIndex));
        }

        return sb.toString();
    }
}
