package com.vincennlin.leetcode.bit.easy.addbinary;
//67
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            sum = ((i >= 0 ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0) + (j >= 0 ? Integer.parseInt(String.valueOf(b.charAt(j))) : 0) + carry);
            carry = sum / 2;
            sum = sum % 2;

            sb.append(sum);
            i--;
            j--;
        }

        if (carry > 0) sb.append(carry);

        return sb.reverse().toString();
    }
}