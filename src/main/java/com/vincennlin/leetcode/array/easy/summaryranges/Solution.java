package com.vincennlin.leetcode.array.easy.summaryranges;

import java.util.ArrayList;
import java.util.List;
//228
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rangesList = new ArrayList<>();
        if (nums.length == 0) return rangesList;
        if (nums.length == 1) {
            rangesList.add("" + nums[0]);
            return rangesList;
        }

        int startIndex = 0;
        for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] != nums[currentIndex-1] + 1) {
                int endIndex = currentIndex - 1;
                if (startIndex == endIndex) {
                    rangesList.add("" + nums[startIndex]);
                } else {
                    rangesList.add(nums[startIndex] + "->" + nums[endIndex]);
                }
                startIndex = currentIndex;
            }
        }

        if (startIndex == nums.length - 1) {
            rangesList.add("" + nums[startIndex]);
        } else {
            rangesList.add(nums[startIndex] + "->" + nums[nums.length-1]);
        }

        return rangesList;
    }
}
