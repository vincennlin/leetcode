package com.vincennlin.leetcode.Array;

public class No_58 {

    public static void main(String[] args) {
        String s = "  hello   world    ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return ans;
            }
            ans++;
        }
        return ans;
    }
}
