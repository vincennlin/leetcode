package com.vincennlin.leetcode.numbertheory.medium.closestprimenumbersinrange;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 2523
class Solution {
    public int[] closestPrimes(int left, int right) {
        Set<Integer> composites = getComposites(right);
        List<Integer> primes = new ArrayList<>();

        for (int num = Math.max(left, 2); num <= right; num++) {
            if (!composites.contains(num)) {
                primes.add(num);
            }
        }

        int[] result = new int[]{-1, -1};

        if (primes.size() < 2) {
            return result;
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }

        return result;
    }

    private Set<Integer> getComposites(int range) {
        Set<Integer> composites = new HashSet<>();

        for (int num = 2; num * num <= range; num++) {
            if (!composites.contains(num)) {
                for (int multiple = num * num; multiple <= range; multiple += num) {
                    composites.add(multiple);
                }
            }
        }

        return composites;
    }
}
