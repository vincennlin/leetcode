package com.vincennlin.leetcode.linkedlist.medium.insertgreatestcommondivisorsinlinkedlist;
/*
Given the head of a linked list head, in which each node contains an integer value.

Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.

Return the linked list after insertion.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.



Example 1:


Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]
Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
There are no more adjacent nodes, so we return the linked list.
Example 2:


Input: head = [7]
Output: [7]
Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
There are no pairs of adjacent nodes, so we return the initial linked list.


Constraints:

The number of nodes in the list is in the range [1, 5000].
1 <= Node.val <= 1000
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))));
        ListNode result1 = solution.insertGreatestCommonDivisors(head1);
        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }
        // 18 6 6 2 10 1 3

        System.out.println();

        ListNode head2 = new ListNode(7);
        ListNode result2 = solution.insertGreatestCommonDivisors(head2);
        while (result2 != null) {
            System.out.print(result2.val + " ");
            result2 = result2.next;
        }
        // 7
    }
}
