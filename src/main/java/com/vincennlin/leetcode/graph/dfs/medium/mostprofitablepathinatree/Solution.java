package com.vincennlin.leetcode.graph.dfs.medium.mostprofitablepathinatree;

import java.util.*;

// 2467
class Solution {
    int maxIncome;

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        maxIncome = Integer.MIN_VALUE;
        int nodes = edges.length + 1;
        boolean[] visited = new boolean[nodes];
        Map<Integer, Integer> pathTimeByBob = new HashMap<>();
        List<List<Integer>> neighbors = new ArrayList<>();

        for (int i = 0; i < nodes; i++) {
            neighbors.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            neighbors.get(edge[0]).add(edge[1]);
            neighbors.get(edge[1]).add(edge[0]);
        }

        findBobPath(neighbors, visited, pathTimeByBob, 0, bob);

        Arrays.fill(visited, false);

        findAlicePath(neighbors, visited, pathTimeByBob, 0, amount, 0, 0);

        return maxIncome;
    }

    private void findAlicePath(List<List<Integer>> neighbors, boolean[] visited, Map<Integer, Integer> pathTimeByBob,
                               int time, int[] amount, int income, int node) {
        visited[node] = true;

        if (!pathTimeByBob.containsKey(node) || time < pathTimeByBob.get(node)) {
            income += amount[node];
        } else if (time == pathTimeByBob.get(node)) {
            income += amount[node] / 2;
        }

        if (node != 0 && neighbors.get(node).size() == 1) {
            maxIncome = Math.max(maxIncome, income);
        }

        for (int neighbor : neighbors.get(node)) {
            if (!visited[neighbor]) {
                findAlicePath(neighbors, visited, pathTimeByBob, time + 1, amount, income, neighbor);
            }
        }
    }

    private boolean findBobPath(List<List<Integer>> neighbors, boolean[] visited, Map<Integer, Integer> pathTimeByBob, int time, int node) {
        pathTimeByBob.put(node, time);
        visited[node] = true;

        if (node == 0) {
            return true;
        }

        for (int neighbor : neighbors.get(node)) {
            if (!visited[neighbor] && findBobPath(neighbors, visited, pathTimeByBob, time + 1, neighbor)) {
                return true;
            }
        }

        pathTimeByBob.remove(node);

        return false;
    }
}