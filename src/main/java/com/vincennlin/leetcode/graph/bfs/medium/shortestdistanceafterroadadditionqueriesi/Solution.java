package com.vincennlin.leetcode.graph.bfs.medium.shortestdistanceafterroadadditionqueriesi;

import java.util.LinkedList;
import java.util.Queue;

// 3243
class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] result = new int[queries.length];
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited;

        for (int i = 0; i < queries.length; i++) {
            queue.add(0);
            visited = new boolean[n];
            int[] query = queries[i];
            int path = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    int current = queue.poll();
                    visited[current] = true;
                    if (current == n - 1) {
                        result[i] = path;
                        break;
                    }
                    if (!visited[current + 1]) {
                        queue.add(current + 1);
                    }
                    if (current == query[0] && !visited[query[1]]) {
                        queue.add(query[1]);
                    }

                }
                if (result[i] != 0) {
                    break;
                }
                path++;
            }
        }

        return result;
    }
}