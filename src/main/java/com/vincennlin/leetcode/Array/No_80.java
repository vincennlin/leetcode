package com.vincennlin.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class No_80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            nums[left] = nums[right];
            if (map.getOrDefault(nums[right], 0) <= 1) {
                map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
                left++;
            }
        }
        return left;
    }
}
