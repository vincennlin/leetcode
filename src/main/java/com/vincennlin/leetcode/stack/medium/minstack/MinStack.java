package com.vincennlin.leetcode.stack.medium.minstack;

import java.util.ArrayList;
import java.util.List;

//155
class MinStack {

    private List<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.add(new int[]{val, val});
        } else {
            int minVal = Math.min(val, getMin());
            stack.add(new int[]{val, minVal});
        }
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1)[0];
    }

    public int getMin() {
        return stack.get(stack.size() - 1)[1];
    }
}
