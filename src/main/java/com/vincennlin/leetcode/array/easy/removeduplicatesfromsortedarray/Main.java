package com.vincennlin.leetcode.array.easy.removeduplicatesfromsortedarray;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,1};
        int k = solution.removeDuplicates(nums);

        System.out.println(k);
    }
}
