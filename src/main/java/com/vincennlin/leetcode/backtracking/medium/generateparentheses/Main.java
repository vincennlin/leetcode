package com.vincennlin.leetcode.backtracking.medium.generateparentheses;
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]

Constraints:

1 <= n <= 8
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.generateParenthesis(3)); // ["((()))","(()())","(())()","()(())","()()()"]

        System.out.println(solution.generateParenthesis(1)); // ["()"]
    }
}
