package com.vincennlin.leetcode.string.medium.addingspacestoastring;
// 2109
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (spaceIndex < spaces.length && spaces[spaceIndex] == i) {
                sb.append(" ");
                spaceIndex++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}