package com.vincennlin.leetcode.array.easy.greatestcommondivisorofstrings;
// 1071
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        int gcd = gcd(m, n);

        String prefix = str1.substring(0, gcd);

        if (prefix.repeat(m / gcd).equals(str1) && prefix.repeat(n / gcd).equals(str2)) {
            return prefix;
        } else {
            return "";
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
