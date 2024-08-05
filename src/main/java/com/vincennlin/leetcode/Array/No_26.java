package com.vincennlin.leetcode.Array;

public class No_26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,1};
        int k = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {return 1;}
        int leftPointer = 0;
        int current = nums[0];
        for (int rightPointer = 1; rightPointer < nums.length; rightPointer++) {
            if (current != nums[rightPointer]) {
                leftPointer ++;
                nums[leftPointer] = nums[rightPointer];
                current = nums[rightPointer];
            }
        }
        return leftPointer + 1;
    }
}
