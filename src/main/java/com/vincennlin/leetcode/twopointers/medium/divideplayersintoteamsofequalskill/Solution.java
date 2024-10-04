package com.vincennlin.leetcode.twopointers.medium.divideplayersintoteamsofequalskill;

import java.util.Arrays;

// 2491
class Solution {
    public long dividePlayers(int[] skill) {
        int m = skill.length;

        Arrays.sort(skill);

        long chemistry = 0;
        int skillSum = skill[0] + skill[m - 1];

        for (int left = 0, right = m - 1; left < right; left++, right--) {
            if (skill[left] + skill[right] != skillSum) return -1;
            chemistry += (long) skill[left] * skill[right];
        }

        return chemistry;
    }
}