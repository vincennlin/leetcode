package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.differentwaystoaddparentheses;

import java.util.ArrayList;
import java.util.List;

// 241
class Solution {
    private List<Integer>[][] dp;
    private List<Integer> numbers;
    private List<Character> operators;

    public List<Integer> diffWaysToCompute(String expression) {
        numbers = new ArrayList<>();
        operators = new ArrayList<>();

        int num = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else {
                numbers.add(num);
                num = 0;
                operators.add(c);
            }
        }
        numbers.add(num);

        int m = numbers.size();
        dp = new List[m][m];

        return divide(0, m - 1);
    }

    private List<Integer> divide(int start, int end) {
        if (dp[start][end] != null) {
            return dp[start][end];
        }

        List<Integer> result = new ArrayList<>();
        if (start == end) {
            result.add(numbers.get(start));
        } else {
            for (int i = start; i < end; i++) {
                List<Integer> leftResults = divide(start, i);
                List<Integer> rightResults = divide(i + 1, end);

                char operator = operators.get(i);
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        result.add(applyOperator(operator, left, right));
                    }
                }
            }
        }

        dp[start][end] = result;
        return result;
    }

    private int applyOperator(char operator, int a, int b) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }
}