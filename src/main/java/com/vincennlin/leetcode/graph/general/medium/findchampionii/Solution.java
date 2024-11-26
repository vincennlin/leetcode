package com.vincennlin.leetcode.graph.general.medium.findchampionii;
// 2924
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] inDegrees = new int[n];
        for (int[] edge : edges) {
            inDegrees[edge[1]]++;
        }

        int champion = -1;
        for (int i = 0; i < n; i++) {
            if (inDegrees[i] == 0) {
                if (champion != -1) {
                    return -1;
                }
                champion = i;
            }
        }

        return champion;
    }
}
