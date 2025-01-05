package com.vincennlin.leetcode.prefixsum.medium.shiftinglettersii;
// 2381
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diffArray = new int[n + 1]; // 差分陣列

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            diffArray[start] += (direction == 1 ? 1 : -1);
            diffArray[end + 1] -= (direction == 1 ? 1 : -1);
        }

        for (int i = 1; i < n; i++) {
            diffArray[i] += diffArray[i - 1];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int shift = (diffArray[i] % 26 + 26) % 26;
            sb.append((char) ('a' + (s.charAt(i) - 'a' + shift) % 26));
        }

        return sb.toString();
    }
}
