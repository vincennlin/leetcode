package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.longestpalindromicsubstring;
/*
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"
Output: "bb"

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.longestPalindrome("babad")); // "bab"

        System.out.println(solution.longestPalindrome("cbbd")); // "bb"

        System.out.println(solution.longestPalindrome("a")); // "a"

        System.out.println(solution.longestPalindrome("ac")); // "a"
    }
}
