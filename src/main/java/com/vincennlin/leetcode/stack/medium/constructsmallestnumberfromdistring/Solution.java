package com.vincennlin.leetcode.stack.medium.constructsmallestnumberfromdistring;
// 2375
class Solution {
    public String smallestNumber(String pattern) {
        char[] chars = pattern.toCharArray();

        int[] ds = countDs(chars);

        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[9];
        int smallest = 1;
        seen[0] = true;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                sb.append(smallest);

                do {
                    smallest++;
                } while (seen[smallest]);

                seen[smallest] = true;
            } else {
                sb.append(smallest + ds[i]);
                seen[smallest + ds[i] - 1] = true;
            }
        }

        sb.append(smallest);

        return sb.toString();
    }

    private int[] countDs(char[] chars) {
        int[] ds = new int[chars.length + 1];
        int count = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            ds[i + 1] = count;
            if (chars[i] == 'D') {
                count++;
            } else {
                count = 0;
            }
        }

        ds[0] = count;

        return ds;
    }
}