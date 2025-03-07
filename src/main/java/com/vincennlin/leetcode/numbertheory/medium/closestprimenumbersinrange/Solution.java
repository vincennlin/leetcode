package com.vincennlin.leetcode.numbertheory.medium.closestprimenumbersinrange;

import java.util.ArrayList;
import java.util.List;

// 2523
class Solution {

    public int[] closestPrimes(int left, int right) {
        boolean[] notPrimeArray = getNotPrimeArray(right);

        List<Integer> primeNumbers = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (!notPrimeArray[num]) {
                primeNumbers.add(num);
            }
        }

        int[] result = new int[]{-1, -1};

        if (primeNumbers.size() < 2) {
            return result;
        }

        int minDifference = Integer.MAX_VALUE;

        for (int index = 1; index < primeNumbers.size(); index++) {
            int difference =
                    primeNumbers.get(index) - primeNumbers.get(index - 1);
            if (difference < minDifference) {
                minDifference = difference;
                result[0] = primeNumbers.get(index - 1);
                result[1] = primeNumbers.get(index);
            }
        }

        return result;
    }

    private boolean[] getNotPrimeArray(int upperLimit) {
        boolean[] isNotPrime = new boolean[upperLimit + 1];

        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int number = 2; number * number <= upperLimit; number++) {
            if (!isNotPrime[number]) {
                for (
                        int multiple = number * number;
                        multiple <= upperLimit;
                        multiple += number
                ) {
                    isNotPrime[multiple] = true;
                }
            }
        }
        return isNotPrime;
    }
}