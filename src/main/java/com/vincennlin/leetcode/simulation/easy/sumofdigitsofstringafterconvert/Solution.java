package com.vincennlin.leetcode.simulation.easy.sumofdigitsofstringafterconvert;
// 1945
class Solution {
    public int getLucky(String s, int k) {

        StringBuilder number = new StringBuilder();

        for (char c : s.toCharArray()) {
            number.append(c - 'a' + 1);
        }

        String digits = number.toString();

        for (int i = 0; i < k; i++){
            long newSum = 0;
            for (char c : digits.toCharArray()) {
                newSum += c - '0';
            }
            digits = Long.toString(newSum);
        }

        return Integer.parseInt(digits);
    }
}