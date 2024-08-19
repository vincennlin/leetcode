package com.vincennlin.leetcode.stack.medium.minstack;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Push elements onto the stack
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // Retrieve the minimum element
        System.out.println(minStack.getMin()); // Output: -3

        // Pop the top element
        minStack.pop();

        // Get the top element
        System.out.println(minStack.top()); // Output: 0

        // Retrieve the minimum element
        System.out.println(minStack.getMin()); // Output: -2
    }
}
