package com.vincennlin.leetcode.stack.hard.basiccalculator;

import java.util.ArrayDeque;
import java.util.Deque;

//224
class Solution {
    public int calculate(String s) {
        s = s.trim();
        if (!s.startsWith("(") && !s.endsWith(")")) s = "(" + s + ")";
        Deque<String> tokenStack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            String token = String.valueOf(s.charAt(i));
            if (token.equals(" ")) continue;
            if (token.equals(")")) {

                Deque<String> parenthesesStack = new ArrayDeque<>();
                while (!tokenStack.peek().equals("(")) {
                    parenthesesStack.push(tokenStack.pop());
                }
                tokenStack.pop();

                while (parenthesesStack.size() > 1) {
                    int currentNum = Integer.parseInt(parenthesesStack.pop());
                    while (!parenthesesStack.isEmpty() && !parenthesesStack.peek().equals("(") && !parenthesesStack.peek().equals("+") && !parenthesesStack.peek().equals("-")) {
                        currentNum = Integer.parseInt(parenthesesStack.pop()) + 10 * currentNum;
                    }
                    if (parenthesesStack.isEmpty()) {
                        parenthesesStack.push(String.valueOf(currentNum));
                        break;
                    }
                    token = parenthesesStack.pop();
                    switch (token) {
                        case "+" ->
                                parenthesesStack.push(String.valueOf(currentNum + Integer.parseInt(parenthesesStack.pop())));
                        case "-" ->
                                parenthesesStack.push(String.valueOf(currentNum - Integer.parseInt(parenthesesStack.pop())));
                        case "(" ->
                                parenthesesStack.push(String.valueOf(currentNum));
                    }
                }
                tokenStack.push(parenthesesStack.poll());
            } else {
                tokenStack.push(token);
            }
        }

        while (tokenStack.size() > 1) {
            int currentNum = Integer.parseInt(tokenStack.pollLast());
            String token = tokenStack.pollLast();
            switch (token) {
                case "+":
                    tokenStack.push(String.valueOf(currentNum + Integer.parseInt(tokenStack.pop())));
                    break;
                case "-":
                    tokenStack.push(String.valueOf(currentNum - Integer.parseInt(tokenStack.pop())));
                    break;
            }
        }

        return Integer.parseInt(tokenStack.pop());
    }
}
