package com.vincennlin.leetcode.graph.dfs.medium.mostprofitablepathinatree;

import java.util.*;

// 2467
class Solution {
    int maxIncome;

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        maxIncome = Integer.MIN_VALUE;
        int nodes = edges.length + 1;
        boolean[] visitedByBob = new boolean[nodes];
        List<Integer> timestampsByBob = new ArrayList<>();
        List<List<Integer>> neighbors = new ArrayList<>();

        for (int i = 0; i < nodes; i++) {
            neighbors.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            neighbors.get(edge[0]).add(edge[1]);
            neighbors.get(edge[1]).add(edge[0]);
        }

        dfsByBob(neighbors, visitedByBob, timestampsByBob, bob);

        boolean[] visitedByAlice = new boolean[nodes];
        Arrays.fill(visitedByBob, false);

        dfsByAlice(neighbors, visitedByAlice, visitedByBob, timestampsByBob, 0, 0, amount, 0);

        return maxIncome;
    }

    private void dfsByAlice(List<List<Integer>> neighbors, boolean[] visitedByAlice, boolean[] visitedByBob,
                            List<Integer> timestampsByBob, int timestamp, int alice, int[] amount, int income) {
        if (timestamp < timestampsByBob.size()) {
            visitedByBob[timestampsByBob.get(timestamp)] = true;
        }
        visitedByAlice[alice] = true;

        if (!visitedByBob[alice]) {
            income += amount[alice];
        } else if (timestampsByBob.get(timestamp) == alice) {
            income += amount[alice] / 2;
        }

        if (alice != 0 && neighbors.get(alice).size() == 1) {
            maxIncome = Math.max(maxIncome, income);
        }

        for (int neighbor : neighbors.get(alice)) {
            if (!visitedByAlice[neighbor]) {
                dfsByAlice(neighbors, visitedByAlice, visitedByBob, timestampsByBob, timestamp + 1, neighbor, amount, income);
                visitedByAlice[neighbor] = false;
                if (timestamp + 1< timestampsByBob.size()) {
                    visitedByBob[timestampsByBob.get(timestamp + 1)] = false;
                }
            }
        }
    }

    private void dfsByBob(List<List<Integer>> neighbors, boolean[] visited, List<Integer> timestampsByBob, int bob) {
        visited[bob] = true;
        timestampsByBob.add(bob);

        if (bob == 0) {
            return;
        }

        for (int neighbor : neighbors.get(bob)) {
            if (!visited[neighbor]) {
                dfsByBob(neighbors, visited, timestampsByBob, neighbor);
                if (timestampsByBob.get(timestampsByBob.size() - 1) == 0) {
                    return;
                }
                visited[bob] = false;
                timestampsByBob.remove(timestampsByBob.size() - 1);
            }
        }
    }
}