package com.vincennlin.leetcode.heap.kthlargestelementinanarray;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,1,5,6,4};
        int k = 6;
        System.out.println(solution.findKthLargest(nums, k));
    }
}
