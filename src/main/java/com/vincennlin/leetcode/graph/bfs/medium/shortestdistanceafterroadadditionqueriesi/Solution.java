package com.vincennlin.leetcode.graph.bfs.medium.shortestdistanceafterroadadditionqueriesi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 3243
class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            if (i < n - 1) {
                graph.get(i).add(i + 1);
            }
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            graph.get(query[0]).add(query[1]);

            result[i] = bfs(graph, n);
        }

        return result;
    }

    private int bfs(List<List<Integer>> graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(0);
        visited[0] = true;
        int pathLength = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == n - 1) {
                    return pathLength;
                }
                for (int neighbor : graph.get(current)) {
                    if (!visited[neighbor]) {
                        queue.add(neighbor);
                        visited[neighbor] = true;
                    }
                }
            }
            pathLength++;
        }

        return -1;
    }
}