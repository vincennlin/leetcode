package com.vincennlin.leetcode.backtracking.medium.thekthlexicographicalstringofallhappystringsoflengthn;
// 1415
class Solution {
    String ans;

    public String getHappyString(int n, int k) {
        ans = "";
        backtracking(n, k, new char[]{'a', 'b', 'c'}, new StringBuilder(), new int[]{0});
        return ans;
    }

    private void backtracking(int n, int k, char[] chars, StringBuilder sb, int[] order) {
        if (sb.length() == n) {
            order[0]++;
            if (order[0] == k) {
                this.ans = sb.toString();
            }
        } else {
            char lastChar = sb.isEmpty() ? 'e' : sb.charAt(sb.length() - 1);

            for (char c : chars) {
                if (lastChar != c) {
                    sb.append(c);
                    backtracking(n, k, chars, sb, order);
                    if (this.ans != "") {
                        return;
                    }
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
    }
}