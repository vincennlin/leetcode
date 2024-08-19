package com.vincennlin.leetcode.bit.easy.addbinary;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: a = "11", b = "1"
        String a1 = "11";
        String b1 = "1";
        System.out.println(solution.addBinary(a1, b1)); // 應該輸出 "100"

        // Example 2: a = "1010", b = "1011"
        String a2 = "1010";
        String b2 = "1011";
        System.out.println(solution.addBinary(a2, b2)); // 應該輸出 "10101"
    }
}
