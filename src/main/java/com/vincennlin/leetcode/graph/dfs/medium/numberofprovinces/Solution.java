package com.vincennlin.leetcode.graph.dfs.medium.numberofprovinces;
// 547
class Solution {
    int provinces;
    public int findCircleNum(int[][] isConnected) {
        provinces = isConnected.length;
        dfs(isConnected, 0);
        return provinces;
    }

    private void dfs(int[][] isConnected, int current) {
        for (int i = current + 1; i < isConnected.length; i++) {
            if (isConnected[current][i] == 1) {
                isConnected[i][current] = 0;
                dfs(isConnected, current + 1);
                provinces--;
            }
        }
    }
}