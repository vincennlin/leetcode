package com.vincennlin.leetcode.stack.medium.evaluatereversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;

//150
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> tokenStack = new ArrayDeque<>();

        for(String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = tokenStack.pop();
                int num1 = tokenStack.pop();
                if (token.equals("+")) {
                    tokenStack.push(num1 + num2);
                } else if (token.equals("-")) {
                    tokenStack.push(num1 - num2);
                } else if (token.equals("*")) {
                    tokenStack.push(num1 * num2);
                } else {
                    tokenStack.push(num1 / num2);
                }
            } else {
                tokenStack.push(Integer.parseInt(token));
            }
        }

        return tokenStack.pop();
    }
}
