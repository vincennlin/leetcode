package com.vincennlin.leetcode.design.medium.designastackwithincrementoperation;
// 1381
class CustomStack {

    int[] stack;
    int index;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        index = 0;
    }

    public void push(int x) {
        if (index < stack.length) {
            stack[index++] = x;
        }
    }

    public int pop() {
        if (index < 1) {
            return -1;
        }
        return stack[--index];
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(stack.length, k); i++) {
            stack[i] += val;
        }
    }
}
