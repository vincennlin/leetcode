package com.vincennlin.leetcode.array.easy.validpalindrome;
//125
class Solution {
    public boolean isPalindrome(String s) {
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
