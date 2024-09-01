package com.vincennlin.leetcode.linkedlist.easy.reverselinkedlist;
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversedHead1 = solution.reverseList(head1);
        while (reversedHead1 != null) {
            System.out.print(reversedHead1.val + " ");
            reversedHead1 = reversedHead1.next;
        }
        // 5 4 3 2 1
        System.out.println();

        ListNode head2 = new ListNode(1, new ListNode(2));
        ListNode reversedHead2 = solution.reverseList(head2);
        while (reversedHead2 != null) {
            System.out.print(reversedHead2.val + " ");
            reversedHead2 = reversedHead2.next;
        }
        // 2 1
        System.out.println();

        ListNode head3 = null;
        ListNode reversedHead3 = solution.reverseList(head3);
        while (reversedHead3 != null) {
            System.out.print(reversedHead3.val + " ");
            reversedHead3 = reversedHead3.next;
        }
        //
        System.out.println();
    }
}
