package com.vincennlin.leetcode.binarysearch.medium.shortestsubarraytoberemovedtomakearraysorted;
// 1574
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start < n - 1 && arr[start] <= arr[start + 1]) {
            start++;
        }

        if (start == n - 1) {
            return 0;
        }

        while (end > 0 && arr[end] >= arr[end - 1]) {
            end--;
        }

        int result = Math.min(n - start - 1, end);

        int left = 0, right = end;
        while (left <= start && right < n) {
            if (arr[left] <= arr[right]) {
                result = Math.min(result, right - left - 1);
                left++;
            } else {
                right++;
            }
        }

        return result;
    }
}