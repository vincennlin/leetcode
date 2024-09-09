package com.vincennlin.leetcode.matrix.medium.spiralmatrixiv;
/*
You are given two integers m and n, which represent the dimensions of a matrix.

You are also given the head of a linked list of integers.

Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.

Return the generated matrix.



Example 1:


Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
Explanation: The diagram above shows how the values are printed in the matrix.
Note that the remaining spaces in the matrix are filled with -1.
Example 2:


Input: m = 1, n = 4, head = [0,1,2]
Output: [[0,1,2,-1]]
Explanation: The diagram above shows how the values are printed from left to right in the matrix.
The last space in the matrix is set to -1.


Constraints:

1 <= m, n <= 105
1 <= m * n <= 105
The number of nodes in the list is in the range [1, m * n].
0 <= Node.val <= 1000
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(6, new ListNode(8, new ListNode(1, new ListNode(7, new ListNode(9, new ListNode(4, new ListNode(2, new ListNode(5, new ListNode(5, new ListNode(0)))))))))))));
        int[][] matrix1 = solution.spiralMatrix(3, 5, head1);
        for (int[] row : matrix1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]

        System.out.println();

        ListNode head2 = new ListNode(0, new ListNode(1, new ListNode(2)));
        int[][] matrix2 = solution.spiralMatrix(1, 4, head2);
        for (int[] row : matrix2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // [[0,1,2,-1]]
    }
}
