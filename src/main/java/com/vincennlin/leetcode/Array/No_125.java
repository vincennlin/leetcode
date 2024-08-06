package com.vincennlin.leetcode.Array;

public class No_125 {

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        for (int right = s.length() - 1; right > left; right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
        }
        return true;
    }
}
