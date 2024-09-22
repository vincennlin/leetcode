package com.vincennlin.leetcode.dfs.hard.kthsmallestinlexicographicalorder;
// 440
class Solution {
    public int findKthNumber(int n, int k) {
        int currentNum = 1;
        k--;

        while (k > 0) {
            int count = getCount(n, currentNum, currentNum + 1);
            if (count <= k) {
                currentNum++;
                k -= count;
            } else {
                currentNum *= 10;
                k--;
            }
        }

        return currentNum;
    }

    private int getCount(int n, long prefix, long nextPrefix) {
        int count = 0;
        while (prefix <= n) {
            count += (int) (Math.min(n + 1, nextPrefix) - prefix);
            prefix *= 10;
            nextPrefix *= 10;
        }
        return count;
    }
}
