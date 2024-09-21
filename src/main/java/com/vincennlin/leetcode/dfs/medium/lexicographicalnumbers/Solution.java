package com.vincennlin.leetcode.dfs.medium.lexicographicalnumbers;

import java.util.ArrayList;
import java.util.List;

// 386
class Solution {
    private List<Integer> result;
    private int n;

    public List<Integer> lexicalOrder(int n) {
        this.n = n;
        result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i);
        }
        return result;
    }

    private void dfs(int num) {
        if (num > n) return;
        result.add(num);
        for (int i = 0; i <= 9; i++) {
            int nextNum = num * 10 + i;
            if (nextNum > n) break;
            dfs(nextNum);
        }
    }
}
