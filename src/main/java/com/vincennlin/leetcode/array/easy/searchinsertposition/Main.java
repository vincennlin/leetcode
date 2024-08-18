package com.vincennlin.leetcode.array.easy.searchinsertposition;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1,2,3,5,6,11,18,26};
        int target = 19;

        System.out.println(solution.searchInsert(nums, target));
    }
}
