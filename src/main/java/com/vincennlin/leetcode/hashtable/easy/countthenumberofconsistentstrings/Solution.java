package com.vincennlin.leetcode.hashtable.easy.countthenumberofconsistentstrings;
// 1684
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ht = new boolean[26];
        for (char c : allowed.toCharArray()) {
            ht[c - 'a'] = true;
        }

        int count = 0;
        for(String word : words) {
            count++;
            for (char c : word.toCharArray()) {
                if (!ht[c - 'a']) {
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}