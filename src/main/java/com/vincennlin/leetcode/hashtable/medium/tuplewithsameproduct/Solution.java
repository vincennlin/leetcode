package com.vincennlin.leetcode.hashtable.medium.tuplewithsameproduct;

import java.util.HashMap;
import java.util.Map;

// 1726
class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCountMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                int product = num1 * num2;
                if (!productCountMap.containsKey(product)) {
                    productCountMap.put(product, 1);
                } else {
                    productCountMap.put(product, productCountMap.get(product) + 1);
                }
            }
        }

        int result = 0;

        for (int count : productCountMap.values()) {
            result += 4 * count * (count - 1);
        }

        return result;
    }
}