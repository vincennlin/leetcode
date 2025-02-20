package com.vincennlin.leetcode.backtracking.medium.finduniquebinarystring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 1980
class Solution {
    String ans;

    public String findDifferentBinaryString(String[] nums) {
        ans = null;

        Set<String> stringSet = new HashSet<>(Arrays.asList(nums));

        StringBuilder sb = new StringBuilder();

        backtracking(stringSet, new char[]{'0', '1'}, sb, nums[0].length());

        return ans;
    }

    private void backtracking(Set<String> stringSet, char[] chars, StringBuilder sb, int length) {
        if (sb.length() == length) {
            String str = sb.toString();
            if (!stringSet.contains(str)) {
                ans = str;
            }
            return;
        }

        for(char c : chars) {
            backtracking(stringSet, chars, sb.append(c), length);
            if (ans != null) {
                return;
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
