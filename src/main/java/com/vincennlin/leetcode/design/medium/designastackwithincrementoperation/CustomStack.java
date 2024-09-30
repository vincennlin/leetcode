package com.vincennlin.leetcode.design.medium.designastackwithincrementoperation;

import java.util.ArrayList;
import java.util.List;

// 1381
class CustomStack {

    List<Integer> stack;
    int maxSize;

    public CustomStack(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.add(x);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(stack.size(), k); i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
