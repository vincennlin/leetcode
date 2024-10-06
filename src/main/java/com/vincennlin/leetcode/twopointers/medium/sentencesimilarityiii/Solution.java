package com.vincennlin.leetcode.twopointers.medium.sentencesimilarityiii;
// 1813
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1Array = sentence1.split(" ");
        String[] s2Array = sentence2.split(" ");
        int m = s1Array.length, n = s2Array.length;

        int leftCount = 0;
        while (leftCount < Math.min(m, n) && s1Array[leftCount].equals(s2Array[leftCount])) {
            leftCount++;
        }

        int rightCount = 0;
        while (rightCount < Math.min(m, n) && s1Array[m - 1 - rightCount].equals(s2Array[n - 1 - rightCount])) {
            rightCount++;
        }

        return leftCount + rightCount >= Math.min(m, n);
    }
}
