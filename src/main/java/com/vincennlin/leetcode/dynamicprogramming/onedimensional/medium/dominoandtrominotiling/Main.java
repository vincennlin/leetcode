package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.dominoandtrominotiling;
/*
You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.


Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.

In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.



Example 1:


Input: n = 3
Output: 5
Explanation: The five different ways are show above.
Example 2:

Input: n = 1
Output: 1


Constraints:

1 <= n <= 1000
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.numTilings(3)); // 5

        System.out.println(solution.numTilings(1)); // 1

        System.out.println(solution.numTilings(4)); // 11

        System.out.println(solution.numTilings(5)); // 24

        System.out.println(solution.numTilings(6)); // 53

        System.out.println(solution.numTilings(60)); // 882347204
    }
}
