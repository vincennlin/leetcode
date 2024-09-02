package com.vincennlin.leetcode.graph.dfs.medium.numberofprovinces;
// 547
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] isVisited = new boolean[isConnected.length];
        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!isVisited[i]) {
                provinces++;
                dfs(isConnected, isVisited, i);
            }
        }
        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] isVisited, int i) {
        isVisited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !isVisited[j]) {
                dfs(isConnected, isVisited, j);
            }
        }
    }
}