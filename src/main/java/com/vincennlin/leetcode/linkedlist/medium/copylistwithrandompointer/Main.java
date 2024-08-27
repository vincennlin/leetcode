package com.vincennlin.leetcode.linkedlist.medium.copylistwithrandompointer;
/*
A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.

Example 1:

Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

Example 2:

Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]

Example 3:

Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]

Constraints:

0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Node head1 = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        head1.next = node1;
        head1.random = null;
        node1.next = node2;
        node1.random = head1;
        node2.next = node3;
        node2.random = node4;
        node3.next = node4;
        node3.random = node2;
        node4.next = null;
        node4.random = head1;
        Node result1 = solution.copyRandomList(head1);
        System.out.println(result1); // [[7,null],[13,0],[11,4],[10,2],[1,0]]

        Node head2 = new Node(1);
        Node node5 = new Node(2);
        head2.next = node5;
        head2.random = node5;
        node5.next = null;
        node5.random = node5;
        Node result2 = solution.copyRandomList(head2);
        System.out.println(result2); // [[1,1],[2,1]]

        Node head3 = new Node(3);
        Node node6 = new Node(3);
        Node node7 = new Node(3);
        head3.next = node6;
        head3.random = null;
        node6.next = node7;
        node6.random = head3;
        node7.next = null;
        node7.random = null;
        Node result3 = solution.copyRandomList(head3);
        System.out.println(result3); // [[3,null],[3,0],[3,null]]
    }
}
