package com.vincennlin.leetcode.greedy.medium.largestnumber;
/*
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.



Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.largestNumber(new int[]{10, 2})); // "210"

        System.out.println(solution.largestNumber(new int[]{3, 30, 34, 5, 9})); // "9534330"
    }
}
