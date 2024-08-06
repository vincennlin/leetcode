package com.vincennlin.leetcode.Array;

public class No_125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            Character charLeft = s.charAt(left), charRight = s.charAt(right);
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } else if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
