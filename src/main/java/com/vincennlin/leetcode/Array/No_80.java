package com.vincennlin.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class No_80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }

        int left = 2;
        for (int right = 2; right < n; right++) {
            if (nums[right] != nums[left - 2]) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}
