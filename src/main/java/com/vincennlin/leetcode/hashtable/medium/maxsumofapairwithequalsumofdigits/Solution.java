package com.vincennlin.leetcode.hashtable.medium.maxsumofapairwithequalsumofdigits;

import java.util.HashMap;
import java.util.Map;

// 2342
class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int result = -1;

        for (int num : nums) {
            int digitsSum = digitsSum(num);
            if (!map.containsKey(digitsSum)) {
                map.put(digitsSum, num);
            } else {
                result = Math.max(result, map.get(digitsSum) + num);
                map.put(digitsSum, Math.max(map.get(digitsSum), num));
            }
        }

        return result;
    }

    private int digitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}