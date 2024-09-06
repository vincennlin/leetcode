package com.vincennlin.leetcode.linkedlist.medium.deletenodesfromlinkedlistpresentinarray;
/*
You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.



Example 1:

Input: nums = [1,2,3], head = [1,2,3,4,5]

Output: [4,5]

Explanation:



Remove the nodes with values 1, 2, and 3.

Example 2:

Input: nums = [1], head = [1,2,1,2,1,2]

Output: [2,2,2]

Explanation:



Remove the nodes with value 1.

Example 3:

Input: nums = [5], head = [1,2,3,4]

Output: [1,2,3,4]

Explanation:



No node has value 5.



Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
All elements in nums are unique.
The number of nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105
The input is generated such that there is at least one node in the linked list that has a value not present in nums.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        int[] nums1 = {1, 2, 3};

        ListNode result1 = solution.modifiedList(nums1, head1);

        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        } // 4 5

        System.out.println();

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(1);
        head2.next.next.next.next.next = new ListNode(2);

        int[] nums2 = {1};

        ListNode result2 = solution.modifiedList(nums2, head2);

        while (result2 != null) {
            System.out.print(result2.val + " ");
            result2 = result2.next;
        } // 2 2 2

        System.out.println();

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(4);

        int[] nums3 = {5};

        ListNode result3 = solution.modifiedList(nums3, head3);

        while (result3 != null) {
            System.out.print(result3.val + " ");
            result3 = result3.next;
        } // 1 2 3 4

        System.out.println();
    }
}
