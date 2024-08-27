package com.vincennlin.leetcode.array.easy.findtheindexofthefirstoccurrenceinastring;
//28
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        for (int hLeft = 0; hLeft < haystack.length() - needle.length() + 1; hLeft++) {
            int hRight = hLeft;
            for (int nIndex = 0; nIndex < needle.length(); nIndex++) {
                if (haystack.charAt(hRight) != needle.charAt(nIndex)) break;
                if (nIndex == needle.length() - 1) return hLeft;
                hRight++;
            }
        }
        return -1;
    }
}
