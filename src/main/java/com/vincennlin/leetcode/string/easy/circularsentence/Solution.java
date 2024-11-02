package com.vincennlin.leetcode.string.easy.circularsentence;
// 2490
class Solution {
    public boolean isCircularSentence(String sentence) {
        for (int i = 1; i < sentence.length() - 1; i++) {
            char c = sentence.charAt(i);
            if (c == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }

        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
    }
}
