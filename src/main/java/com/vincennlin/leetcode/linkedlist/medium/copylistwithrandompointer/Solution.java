package com.vincennlin.leetcode.linkedlist.medium.copylistwithrandompointer;
//138
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node currentNode = head;
        while (currentNode != null) {
            Node newNode = new Node(currentNode.val);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            currentNode = newNode.next;
        }

        currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.random != null) {
                currentNode.next.random = currentNode.random.next;
            }
            currentNode = currentNode.next.next;
        }

        Node newHead = head.next;
        currentNode = head;
        while (currentNode != null) {
            Node newNode = currentNode.next;
            currentNode.next = newNode.next;
            if (newNode.next != null) {
                newNode.next = newNode.next.next;
            }
            currentNode = currentNode.next;
        }

        return newHead;
    }
}