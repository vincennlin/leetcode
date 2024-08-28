package com.vincennlin.leetcode.hashtable.easy.happynumber;

import java.util.HashSet;
import java.util.Set;

//202
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet<>();

        while (true) {
            n = sumOfSquares(n);
            if (numSet.contains(n)) return false;
            if (n == 1) return true;
            numSet.add(n);
        }
    }

    private int sumOfSquares(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return result;
    }
}
