package com.vincennlin.leetcode.Array;

public class No_88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int k = m + n - 1;
        while(right >= 0) {
            if (left >= 0 && nums1[left] >= nums2[right]) {
                nums1[k--] = nums1[left--];
            } else {
                nums1[k--] = nums2[right--];
            }
        }
    }
}
