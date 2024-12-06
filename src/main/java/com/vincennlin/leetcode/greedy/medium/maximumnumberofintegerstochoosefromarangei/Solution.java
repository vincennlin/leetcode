package com.vincennlin.leetcode.greedy.medium.maximumnumberofintegerstochoosefromarangei;

import java.util.HashSet;
import java.util.Set;

// 2554
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedSet =  new HashSet<>();
        for (int bannedNum : banned) {
            bannedSet.add(bannedNum);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i)) {
                if (maxSum - i >= 0) {
                    maxSum -= i;
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}