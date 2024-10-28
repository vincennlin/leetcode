package com.vincennlin.leetcode.hashtable.medium.longestsquarestreakinanarray;

import java.util.HashSet;
import java.util.Set;

// 2501
class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            int streak = 0;
            long next = num;

            while (set.contains((int) next)) {
                streak++;

                if (next * next > 100000) {
                    break;
                }

                next *= next;
            }

            longest = Math.max(longest, streak);
        }

        return longest < 2 ? -1 : longest;
    }
}