package com.vincennlin.leetcode.design.medium.designcirculardeque;
// 641
class MyCircularDeque {

    private int size;
    private final int limit;
    private Node head;
    private Node tail;

    public MyCircularDeque(int k) {
        this.size = 0;
        this.limit = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        Node node = new Node(value);
        if (isEmpty()) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return head.value;
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return tail.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == limit;
    }
}

class Node {

    int value;
    Node prev;
    Node next;

    Node (int value) {
        this.value = value;
    }
}