package com.vincennlin.leetcode.array.medium.reversewordsinastring;
//151
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--) {
            if (strArray[i].isEmpty() || strArray[i].equals(" ")) continue;
            sb.append(strArray[i]);
            if (i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
