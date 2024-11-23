package com.vincennlin.leetcode.matrix.medium.rotatingthebox;

import java.util.Arrays;

/*
You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:

A stone '#'
A stationary obstacle '*'
Empty '.'
The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.

It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.

Return an n x m matrix representing the box after the rotation described above.



Example 1:



Input: box = [["#",".","#"]]
Output: [["."],
         ["#"],
         ["#"]]
Example 2:



Input: box = [["#",".","*","."],
              ["#","#","*","."]]
Output: [["#","."],
         ["#","#"],
         ["*","*"],
         [".","."]]
Example 3:



Input: box = [["#","#","*",".","*","."],
              ["#","#","#","*",".","."],
              ["#","#","#",".","#","."]]
Output: [[".","#","#"],
         [".","#","#"],
         ["#","#","*"],
         ["#","*","."],
         ["#",".","*"],
         ["#",".","."]]


Constraints:

m == box.length
n == box[i].length
1 <= m, n <= 500
box[i][j] is either '#', '*', or '.'.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] box1 = new char[][]{{'#', '.', '#'}};
        char[][] result1 = solution.rotateTheBox(box1);

        for (char[] row : result1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        char[][] box2 = new char[][]{{'#', '.', '*', '.'}, {'#', '#', '*', '.'}};
        char[][] result2 = solution.rotateTheBox(box2);

        for (char[] row : result2) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        char[][] box3 = new char[][]{{'#', '#', '*', '.', '*', '.'}, {'#', '#', '#', '*', '.', '.'}, {'#', '#', '#', '.', '#', '.'}};
        char[][] result3 = solution.rotateTheBox(box3);

        for (char[] row : result3) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
