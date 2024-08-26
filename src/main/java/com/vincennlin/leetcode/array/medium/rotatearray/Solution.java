package com.vincennlin.leetcode.array.medium.rotatearray;
//189
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) return;
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
        for (int i = 0; i < k / 2; i ++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }
        for (int i = k; i <= (n - k); i++) {
            int temp = nums[i];
            nums[i] = nums[n + k - i - 1];
            nums[n + k - i - 1] = temp;
        }
    }
}
