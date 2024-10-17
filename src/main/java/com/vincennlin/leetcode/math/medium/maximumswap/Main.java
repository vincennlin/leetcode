package com.vincennlin.leetcode.math.medium.maximumswap;
/*
You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.



Example 1:

Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:

Input: num = 9973
Output: 9973
Explanation: No swap.


Constraints:

0 <= num <= 108
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maximumSwap(2736)); // 7236

        System.out.println(solution.maximumSwap(9973)); // 9973

        // 98368
        System.out.println(solution.maximumSwap(98368)); // 98863
    }
}
