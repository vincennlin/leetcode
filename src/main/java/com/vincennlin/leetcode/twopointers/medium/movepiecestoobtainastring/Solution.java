package com.vincennlin.leetcode.twopointers.medium.movepiecestoobtainastring;
// 2337
class Solution {
    public boolean canChange(String start, String target) {
        int startIndex = 0, targetIndex = 0;

        while (startIndex < start.length() || targetIndex < target.length()) {
            while (startIndex < start.length() && start.charAt(startIndex) == '_') {
                startIndex++;
            }
            while (targetIndex < target.length() && target.charAt(targetIndex) == '_') {
                targetIndex++;
            }

            if (startIndex == start.length() || targetIndex == target.length()) {
                return startIndex == start.length() && targetIndex == target.length();
            }

            if (start.charAt(startIndex) != target.charAt(targetIndex) ||
                    (start.charAt(startIndex) == 'L' && startIndex < targetIndex) ||
                    (start.charAt(startIndex) == 'R' && startIndex > targetIndex)) {
                return false;
            }

            startIndex++;
            targetIndex++;
        }

        return true;
    }
}
