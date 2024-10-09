package com.vincennlin.leetcode.string.medium.minimumaddtomakeparenthesesvalid;
// 921
class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0, imbalance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
                if (balance < 0) {
                    imbalance++;
                    balance = 0;
                }
            }
        }
        if (balance > 0) {
            imbalance += balance;
        }
        return imbalance;
    }
}