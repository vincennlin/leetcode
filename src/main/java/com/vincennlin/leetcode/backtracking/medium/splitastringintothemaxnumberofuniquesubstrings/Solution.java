package com.vincennlin.leetcode.backtracking.medium.splitastringintothemaxnumberofuniquesubstrings;

import java.util.HashSet;
import java.util.Set;

// 1593
class Solution {
    private String s;
    private int max;
    private Set<String> seen;

    public int maxUniqueSplit(String s) {
        this.s = s;
        this.max = 0;
        this.seen = new HashSet<>();
        backtrack(0);
        return max;
    }

    private void backtrack(int start) {
        if (start == s.length()) {
            this.max = Math.max(this.max, seen.size());
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String subString = s.substring(start, end);
            if (seen.contains(subString)) {
                continue;
            }
            seen.add(subString);
            backtrack(end);
            seen.remove(subString);
        }
    }
}
