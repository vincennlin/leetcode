package com.vincennlin.leetcode.math.medium.maximumswap;

import java.util.Arrays;

// 670
class Solution {
    public int maximumSwap(int num) {
        int[] lastIndex = new int[10];
        Arrays.fill(lastIndex, -1);

        int temp = num;
        int index = 0;
        while (temp > 0) {
            int digits = (int) Math.log10(temp);
            int divisor = (int) Math.pow(10, digits);
            int highestDigit = temp / divisor;
            lastIndex[highestDigit] = index;
            index++;
            temp = temp % (divisor * highestDigit);
        }

        int digits = (int) Math.log10(num);
        int highestDigit = num / ((int) Math.pow(10, digits));

        for (int i = 9; i > highestDigit; i--) {
            if (lastIndex[i] == -1) {
                continue;
            }

            StringBuilder tempSb = new StringBuilder(String.valueOf(num));

            int replacement = 0;
            for (; replacement < digits; replacement++) {
                if (tempSb.charAt(replacement) - '0' >= i) {
                    continue;
                } else {
                    break;
                }
            }

            tempSb.replace(lastIndex[i], lastIndex[i] + 1, String.valueOf(highestDigit));
            tempSb.replace(replacement, replacement + 1, String.valueOf(i));

            return Integer.parseInt(tempSb.toString());
        }

        return num;
    }
}