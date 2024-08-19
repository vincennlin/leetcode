package com.vincennlin.leetcode.twopointer.easy.issubsequence;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + solution.isSubsequence(s1, t1));

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Is \"" + s2 + "\" a subsequence of \"" + t2 + "\"? " + solution.isSubsequence(s2, t2));
    }
}
