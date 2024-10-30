package com.vincennlin.leetcode.dynamicprogramming.onedimensional.hard.minimumnumberofremovalstomakemountainarray;
// 1671
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] lisLength = getLisLength(nums);
        int[] ldsLength = getLdsLength(nums);

        int maxLength = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (lisLength[i] > 1 && ldsLength[i] > 1) {
                maxLength = Math.max(maxLength, lisLength[i] + ldsLength[i] - 1);
            }
        }

        return nums.length - maxLength;
    }

    private int[] getLisLength(int[] nums) {
        int[] lisLength = new int[nums.length];
        int[] lis = new int[nums.length];
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int left = 0, right = length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (num > lis[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            lis[left] = num;
            if (left == length) {
                length++;
            }
            lisLength[i] = length;
        }

        return lisLength;
    }

    private int[] getLdsLength(int[] nums) {
        int[] ldsLength = new int[nums.length];
        int[] lds = new int[nums.length];
        int length = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            int left = 0, right = length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (num > lds[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            lds[left] = num;
            if (left == length) {
                length++;
            }
            ldsLength[i] = length;
        }

        return ldsLength;
    }
}