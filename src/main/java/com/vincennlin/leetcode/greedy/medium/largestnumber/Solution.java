package com.vincennlin.leetcode.greedy.medium.largestnumber;

import java.util.ArrayList;
import java.util.List;

// 179
class Solution {
    public String largestNumber(int[] nums) {
        List<String> numberStringList = new ArrayList<>();
        for (int num : nums) {
            numberStringList.add(String.valueOf(num));
        }

        numberStringList.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        StringBuilder result = new StringBuilder();
        for (String numberString : numberStringList) {
            result.append(numberString);
        }

        if (result.toString().startsWith("0")) {
            return "0";
        }

        return result.toString();
    }
}
