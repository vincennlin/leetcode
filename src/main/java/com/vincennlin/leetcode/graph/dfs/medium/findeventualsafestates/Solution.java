package com.vincennlin.leetcode.graph.dfs.medium.findeventualsafestates;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 802
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] inDegree = new int[n];
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int node : graph[i]) {
                adjList.get(node).add(i);
                inDegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        boolean[] safe = new boolean[n];

        while(!queue.isEmpty()) {
            int node = queue.poll();
            safe[node] = true;
            for (int neighbor : adjList.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(safe[i]) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }
}