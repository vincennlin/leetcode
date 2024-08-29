package com.vincennlin.leetcode.bit.easy.numberof1bits;
/*
Write a function that takes the binary representation of a positive integer and returns the number of
set bits it has (also known as the Hamming weight).

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

Constraints:

1 <= n <= 231 - 1


Follow up: If this function is called many times, how would you optimize it?
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.hammingWeight(11)); // 3
        System.out.println(solution.hammingWeight(128)); // 1
        System.out.println(solution.hammingWeight(2147483645)); // 30
    }
}
