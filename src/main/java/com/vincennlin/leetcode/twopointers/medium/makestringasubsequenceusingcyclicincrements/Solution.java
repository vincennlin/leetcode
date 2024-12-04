package com.vincennlin.leetcode.twopointers.medium.makestringasubsequenceusingcyclicincrements;
// 2825
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        for (; i < str1.length() && j < str2.length(); i++) {
            if ((str2.charAt(j) - str1.charAt(i) + 26) % 26 <= 1) {
                j++;
            }
        }
        return j == str2.length();
    }
}