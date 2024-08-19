package com.vincennlin.leetcode.linkedlist.medium.addtwonumbers;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: l1 = [2,4,3], l2 = [5,6,4]
        Solution.ListNode l1_1 = new Solution.ListNode(2);
        l1_1.next = new Solution.ListNode(4);
        l1_1.next.next = new Solution.ListNode(3);

        Solution.ListNode l2_1 = new Solution.ListNode(5);
        l2_1.next = new Solution.ListNode(6);
        l2_1.next.next = new Solution.ListNode(4);

        Solution.ListNode result1 = solution.addTwoNumbers(l1_1, l2_1);
        printList(result1); // 應該輸出 [7,0,8]

        // Example 2: l1 = [0], l2 = [0]
        Solution.ListNode l1_2 = new Solution.ListNode(0);
        Solution.ListNode l2_2 = new Solution.ListNode(0);

        Solution.ListNode result2 = solution.addTwoNumbers(l1_2, l2_2);
        printList(result2); // 應該輸出 [0]

        // Example 3: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Solution.ListNode l1_3 = new Solution.ListNode(9);
        l1_3.next = new Solution.ListNode(9);
        l1_3.next.next = new Solution.ListNode(9);
        l1_3.next.next.next = new Solution.ListNode(9);
        l1_3.next.next.next.next = new Solution.ListNode(9);
        l1_3.next.next.next.next.next = new Solution.ListNode(9);
        l1_3.next.next.next.next.next.next = new Solution.ListNode(9);

        Solution.ListNode l2_3 = new Solution.ListNode(9);
        l2_3.next = new Solution.ListNode(9);
        l2_3.next.next = new Solution.ListNode(9);
        l2_3.next.next.next = new Solution.ListNode(9);

        Solution.ListNode result3 = solution.addTwoNumbers(l1_3, l2_3);
        printList(result3); // 應該輸出 [8,9,9,9,0,0,0,1]
    }

    // 輔助方法，用於打印鏈表
    public static void printList(Solution.ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}

