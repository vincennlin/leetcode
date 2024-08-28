package com.vincennlin.leetcode.slidingwindow.medium.minimumsizesubarraysum;
//209
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftIndex = 0, rightIndex = 0;
        int sum = 0;
        int minSize = Integer.MAX_VALUE;
        while (rightIndex < nums.length) {
            sum += nums[rightIndex];

            while (sum >= target) {
                minSize = Math.min(rightIndex - leftIndex + 1, minSize);
                sum -= nums[leftIndex++];
            }

            rightIndex++;
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
//    Binary Search
//
//    public int minSubArrayLen(int target, int[] nums) {
//        int[] prefixSum = new int[nums.length + 1];
//        prefixSum[0] = 0;
//
//        for(int i = 1; i < prefixSum.length; i++) {
//            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
//        }
//
//        int minSize = Integer.MAX_VALUE;
//        for (int i = 1; i <= nums.length; i++) {
//            int toFind = prefixSum[i] - target;
//            int j = binarySearch(prefixSum, toFind);
//            if (j != -1) {
//                minSize = Math.min(i - j, minSize);
//            }
//        }
//
//        return minSize == Integer.MAX_VALUE ? 0 : minSize;
//    }
//
//    private int binarySearch(int[] prefixSum, int target) {
//        int left = 0, right = prefixSum.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (prefixSum[mid] <= target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return right;
//    }
}
