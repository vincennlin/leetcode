package com.vincennlin.leetcode.stringmatching.hard.shortestpalindrome;
/*
You are given a string s. You can convert s to a
palindrome
 by adding characters in front of it.

Return the shortest palindrome you can find by performing this transformation.



Example 1:

Input: s = "aacecaaa"
Output: "aaacecaaa"
Example 2:

Input: s = "abcd"
Output: "dcbabcd"


Constraints:

0 <= s.length <= 5 * 104
s consists of lowercase English letters only.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.shortestPalindrome("aacecaaa")); // "aaacecaaa"

        System.out.println(solution.shortestPalindrome("ababc")); // "cbababc"

        System.out.println(solution.shortestPalindrome("abcd")); // "dcbabcd"
    }
}
