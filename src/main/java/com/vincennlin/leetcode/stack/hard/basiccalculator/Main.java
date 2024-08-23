package com.vincennlin.leetcode.stack.hard.basiccalculator;
/*
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().


Example 1:

Input: s = "1 + 1"
Output: 2

Example 2:

Input: s = " 2-1 + 2 "
Output: 3

Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23


Constraints:

1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "1 + 1";
        System.out.println(solution.calculate(s)); // 2

        String s2 = " 2-1 + 2 ";
        System.out.println(solution.calculate(s2)); // 3

        String s3 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(solution.calculate(s3)); // 23

        String s4 = "2147483647";
        System.out.println(solution.calculate(s4)); // 2147483647

        String s5 = "1-(     -2)";
        System.out.println(solution.calculate(s5)); // 3
    }
}
