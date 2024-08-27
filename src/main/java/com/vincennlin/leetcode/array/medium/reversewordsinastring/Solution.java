package com.vincennlin.leetcode.array.medium.reversewordsinastring;
//151
class Solution {
    public String reverseWords(String s) {
        String[] strArray = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = strArray.length - 1; i >= 0; i--) {
            sb.append(strArray[i]);
            if (i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
