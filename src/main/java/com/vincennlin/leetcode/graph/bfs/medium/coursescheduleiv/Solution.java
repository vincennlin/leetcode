package com.vincennlin.leetcode.graph.bfs.medium.coursescheduleiv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//  1462
class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] isReachable = new boolean[numCourses][numCourses];
        Queue<int[]> queue = new LinkedList<>();

        for (int[] prerequisite : prerequisites) {
            queue.add(new int[]{prerequisite[0], prerequisite[1]});
            isReachable[prerequisite[0]][prerequisite[1]] = true;
        }

        while (!queue.isEmpty()) {
            int[] edge = queue.poll();
            int from = edge[0];
            int to = edge[1];
            isReachable[from][to] = true;
            for (int anotherFrom = 0; anotherFrom < numCourses; anotherFrom++) {
                if (anotherFrom != from && isReachable[anotherFrom][from] && !isReachable[anotherFrom][to]) {
                    queue.add(new int[]{anotherFrom, to});
                }
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int[] query : queries) {
            result.add(isReachable[query[0]][query[1]]);
        }

        return result;
    }
}