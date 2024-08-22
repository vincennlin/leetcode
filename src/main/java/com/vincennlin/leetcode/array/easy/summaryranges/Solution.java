package com.vincennlin.leetcode.array.easy.summaryranges;

import java.util.ArrayList;
import java.util.List;
//228
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rangesList = new ArrayList<>();
        if (nums.length == 0) return rangesList;

        int startIndex = 0;
        for (int currentIndex = 1; currentIndex <= nums.length; currentIndex++) {
            if (currentIndex == nums.length || nums[currentIndex] != nums[currentIndex-1] + 1) {
                int endIndex = currentIndex - 1;
                if (startIndex == endIndex) {
                    rangesList.add(String.valueOf(nums[startIndex]));
                } else {
                    rangesList.add(nums[startIndex] + "->" + nums[endIndex]);
                }
                startIndex = currentIndex;
            }
        }

        return rangesList;
    }
}
