package com.vincennlin.leetcode.array.easy.removeduplicatesfromsortedarray;
//26
class Solution {
    public int removeDuplicates(int[] nums) {
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
