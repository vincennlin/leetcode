package com.vincennlin.leetcode.array.medium.productofarrayexceptself;
//238
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = 1;
        }

        int currentProduct = 1;
        for (int i = 1; i < nums.length; i++) {
            currentProduct *= nums[i - 1];
            ans[i] *= currentProduct;
        }
        currentProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            currentProduct *= nums[i + 1];
            ans[i] *= currentProduct;
        }

        return ans;
    }
}