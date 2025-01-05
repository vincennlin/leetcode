package com.vincennlin.leetcode.prefixsum.medium.shiftinglettersii;
// 2381
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] shiftedSums = new int[s.length()];

        for (int[] shift : shifts) {
            for (int i = shift[0]; i <= shift[1]; i++) {
                shiftedSums[i] += shift[2] == 1 ? 1 : -1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < shiftedSums.length; i++) {
            shiftedSums[i] = (shiftedSums[i] % 26 + 26);
            int shiftedIndex = (s.charAt(i) - 'a' + shiftedSums[i]) % 26;
            sb.append((char) ('a' + shiftedIndex));
        }

        return sb.toString();
    }
}
