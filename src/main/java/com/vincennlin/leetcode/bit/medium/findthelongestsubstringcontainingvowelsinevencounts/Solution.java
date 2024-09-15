package com.vincennlin.leetcode.bit.medium.findthelongestsubstringcontainingvowelsinevencounts;

import java.util.Arrays;

// 1371
class Solution {
    public int findTheLongestSubstring(String s) {
        int[] bitArray = new int[32];
        Arrays.fill(bitArray, -2);
        bitArray[0] = -1;

        int bit = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'a':
                    bit ^= (1);
                    break;
                case 'e':
                    bit ^= (1 << 1);
                    break;
                case 'i':
                    bit ^= (1 << 2);
                    break;
                case 'o':
                    bit ^= (1 << 3);
                    break;
                case 'u':
                    bit ^= (1 << 4);
                    break;
            }

            if (bitArray[bit] != -2) {
                maxLength = Math.max(maxLength, i - bitArray[bit]);
            } else {
                bitArray[bit] = i;
            }
        }

        return maxLength;
    }
}
