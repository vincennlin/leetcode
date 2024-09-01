package com.vincennlin.leetcode.linkedlist.easy.mergetwosortedlists;
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:

Input: list1 = [], list2 = []
Output: []

Example 3:

Input: list1 = [], list2 = [0]
Output: [0]

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        while (mergedList1 != null) {
            System.out.print(mergedList1.val + " ");
            mergedList1 = mergedList1.next;
        }
        // 1 1 2 3 4 4
        System.out.println();

        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        while (mergedList2 != null) {
            System.out.print(mergedList2.val + " ");
            mergedList2 = mergedList2.next;
        }
        //
        System.out.println();

        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        while (mergedList3 != null) {
            System.out.print(mergedList3.val + " ");
            mergedList3 = mergedList3.next;
        }
        // 0
        System.out.println();
    }
}
