package com.vincennlin.leetcode.string.medium.parsingabooleanexpression;

import java.util.*;

// 1106
class Solution {
    public boolean parseBoolExpr(String expression) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : expression.toCharArray()) {
            if (c != ')') {
                stack.add(c);
            } else {
                Queue<Boolean> subExpression = new LinkedList<>();
                while (stack.peekLast() != '(') {
                    char polled = stack.pollLast();
                    if (polled == 'f') {
                        subExpression.add(false);
                    } else if (polled == 't'){
                        subExpression.add(true);
                    }
                }
                stack.pollLast();
                stack.add(parse(stack.pollLast(), subExpression) ? 't' : 'f');
            }
        }

        return stack.peek() == 't';
    }

    private boolean parse(char logical, Queue<Boolean> subExpression) {
        if (logical == '&') {
            return parseAnd(subExpression);
        } else if (logical == '|') {
            return parseOr(subExpression);
        } else {
            return parseNot(subExpression);
        }
    }

    private boolean parseOr(Queue<Boolean> subExpression) {
        return subExpression.stream().anyMatch(element -> element);
    }

    private boolean parseAnd(Queue<Boolean> subExpression) {
        return subExpression.stream().allMatch(element -> element);
    }

    private boolean parseNot(Queue<Boolean> subExpression) {
        return !subExpression.peek();
    }
}