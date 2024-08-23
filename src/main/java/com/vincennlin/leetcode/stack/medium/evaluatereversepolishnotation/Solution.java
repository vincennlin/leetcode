package com.vincennlin.leetcode.stack.medium.evaluatereversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;

//150
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> tokenStack = new ArrayDeque<>();

        for(String token : tokens) {
            switch (token) {
                case "+":
                    tokenStack.push(tokenStack.pop() + tokenStack.pop());
                    break;
                case "-":
                    int num2 = tokenStack.pop();
                    int num1 = tokenStack.pop();
                    tokenStack.push(num1 - num2);
                    break;
                case "*":
                    tokenStack.push(tokenStack.pop() * tokenStack.pop());
                    break;
                case "/":
                    num2 = tokenStack.pop();
                    num1 = tokenStack.pop();
                    tokenStack.push(num1 / num2);
                    break;
                default:
                    tokenStack.push(Integer.parseInt(token));
                    break;
            }
        }

        return tokenStack.pop();
    }
}
