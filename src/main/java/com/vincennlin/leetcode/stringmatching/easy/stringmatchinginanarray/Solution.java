package com.vincennlin.leetcode.stringmatching.easy.stringmatchinginanarray;

import java.util.ArrayList;
import java.util.List;

// 1408
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int subIndex = 0; subIndex < words.length; subIndex++) {
            String sub = words[subIndex];
            int[] lps = getLpsArray(sub);

            for (int mainIndex = 0; mainIndex < words.length; mainIndex++) {
                if (subIndex == mainIndex) {
                    continue;
                }

                String main = words[mainIndex];

                if (isSubstring(main, sub, lps)) {
                    result.add(sub);
                    break;
                }
            }
        }

        return result;
    }

    private int[] getLpsArray(String word) {
        int n = word.length();
        int[] lps = new int[n];
        int currentIndex = 1, len = 0;

        while (currentIndex < n) {
            if (word.charAt(currentIndex) == word.charAt(len)) {
                len++;
                lps[currentIndex] = len;
                currentIndex++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    currentIndex++;
                }
            }
        }

        return lps;
    }

    private boolean isSubstring(String main, String sub, int[] lps) {
        int mainIndex = 0, subIndex = 0;

        while (mainIndex < main.length()) {
            if (main.charAt(mainIndex) == sub.charAt(subIndex)) {
                mainIndex++;
                subIndex++;
                if (subIndex == sub.length()) {
                    return true;
                }
            } else {
                if (subIndex > 0) {
                    subIndex = lps[subIndex - 1];
                } else {
                    mainIndex++;
                }
            }
        }

        return false;
    }
}
