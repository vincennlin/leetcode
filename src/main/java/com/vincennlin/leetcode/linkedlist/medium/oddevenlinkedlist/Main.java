package com.vincennlin.leetcode.linkedlist.medium.oddevenlinkedlist;
/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

Example 1:

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:

Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]


Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode result1 = solution.oddEvenList(head1);
        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }
        // 1 3 5 2 4
        System.out.println();

        ListNode head2 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(3);
        ListNode node8 = new ListNode(5);
        ListNode node9 = new ListNode(6);
        ListNode node10 = new ListNode(4);
        ListNode node11 = new ListNode(7);

        head2.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;

        ListNode result2 = solution.oddEvenList(head2);
        while (result2 != null) {
            System.out.print(result2.val + " ");
            result2 = result2.next;
        }
        // 2 3 6 7 1 5 4
        System.out.println();
    }
}
