package com.vincennlin.leetcode.graph.bfs.hard.findminimumdiameteraftermergingtwotrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 3203
class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int diameter1 = getDiameter(edges1);
        int diameter2 = getDiameter(edges2);
        int maxDiameter = Math.max(diameter1, diameter2);

        if (diameter1 == 0 || diameter2 == 0) {
            return maxDiameter;
        } else {
            return Math.max(maxDiameter, diameter1 + diameter2 + 1);
        }

    }

    private int getDiameter(int[][] edges) {
        if (edges.length < 2) {
            return edges.length;
        }

        int m = edges.length + 1;
        List<Integer>[] graph = new List[m];

        for (int i = 0; i < m; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph[node1].add(node2);
            graph[node2].add(node1);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int length = -1;
        boolean[] visited = new boolean[m];

        while (!queue.isEmpty()) {
            int lengthSize = queue.size();
            length++;
            for (int i = 0; i < lengthSize; i++) {
                int node = queue.poll();
                for (int neighbor : graph[node]) {
                    if (visited[neighbor]) {
                        continue;
                    }
                    queue.add(neighbor);
                }
                visited[node] = true;
            }
        }

        return length;
    }
}