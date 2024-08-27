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
        while (currentNode != null && currentNode.next != null) {
            Node tempNode = currentNode.next.next;
            if (tempNode != null) currentNode.next.next = tempNode.next;
            currentNode.next = tempNode;
            currentNode = currentNode.next;
        }

        return newHead;
    }
}