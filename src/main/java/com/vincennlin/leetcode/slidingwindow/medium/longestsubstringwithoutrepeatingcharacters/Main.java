package com.vincennlin.leetcode.slidingwindow.medium.longestsubstringwithoutrepeatingcharacters;
/*
Given a string s, find the length of the longest substringwithout repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s1)); // 3

        String s2 = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s2)); // 1

        String s3 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s3)); // 3
    }
}
