package com.vincennlin.leetcode.numbertheory.medium.closestprimenumbersinrange;

import java.util.HashSet;
import java.util.Set;

// 2523
class Solution {
    public int[] closestPrimes(int left, int right) {
        Set<Integer> composites = getComposites(right);
        int[] result = new int[]{-1, -1};

        int curr = left == 1 ? 2 : left;
        int next = curr + 1;

        while (next <= right) {
            while (curr <= right && composites.contains(curr)) {
                curr++;
            }

            next = curr + 1;

            while (next <= right && composites.contains(next)) {
                next++;
            }

            if (next <= right && (result[0] == -1 || result[1] - result[0] > next - curr)) {
                result[0] = curr;
                result[1] = next;

                if (next - curr <= 2) {
                    return result;
                }
            }

            curr = next;
        }

        return result;
    }

    private Set<Integer> getComposites(int range) {
        Set<Integer> composites = new HashSet<>();

        for (int num = 2; num <= (int) Math.sqrt(range); num++) {
            if (!composites.contains(num)) {
                int curr = num * 2;
                while (curr <= range) {
                    composites.add(curr);
                    curr += num;
                }
            }
        }

        return composites;
    }
}
