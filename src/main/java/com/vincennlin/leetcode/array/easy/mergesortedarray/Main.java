package com.vincennlin.leetcode.array.easy.mergesortedarray;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        solution.merge(nums1, m, nums2, n);
    }

}
