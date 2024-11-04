package com.vincennlin.leetcode.string.medium.stringcompressioniii;
// 3163
class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char lastChar = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (lastChar != c || count >= 9) {
                sb.append(count).append(lastChar);
                count = 0;
            }
            lastChar = c;
            count++;
        }

        return sb.append(count).append(lastChar).toString();
    }
}