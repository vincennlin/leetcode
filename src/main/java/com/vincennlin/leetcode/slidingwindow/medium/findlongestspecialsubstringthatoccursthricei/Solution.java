package com.vincennlin.leetcode.slidingwindow.medium.findlongestspecialsubstringthatoccursthricei;
// 2981
class Solution {
    public int maximumLength(String s) {
        int left = 1, right = s.length() - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (thriceSpecial(s, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right == 0 ? -1 : right;
    }

    private boolean thriceSpecial(String s, int windowSize) {
        int[] specialCharsCount = new int[26];
        char[] charArray = s.toCharArray();

        for (int i = 0; i <= s.length() - windowSize; i++) {
            char c = charArray[i];
            if (isSpecial(charArray, c, i + 1, i + windowSize - 1)) {
                specialCharsCount[c - 'a']++;
                if (specialCharsCount[c - 'a'] >= 3) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isSpecial(char[] charArray, char c, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (charArray[i] != c) {
                return false;
            }
        }
        return true;
    }
}