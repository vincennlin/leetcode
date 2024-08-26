package com.vincennlin.leetcode.array.easy.longestcommonprefix;

import java.util.Arrays;

//14
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs, (o1, o2) -> o2.length() - o1.length());
        if (strs[0].isEmpty()) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i));
        }

        return prefix.toString();
    }
}