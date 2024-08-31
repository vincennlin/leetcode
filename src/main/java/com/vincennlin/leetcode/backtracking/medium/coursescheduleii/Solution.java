package com.vincennlin.leetcode.backtracking.medium.coursescheduleii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 210
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        int[] result = new int[numCourses];
        int resultCount = 0;

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer courseIndex = queue.poll();
            result[resultCount++] = courseIndex;
            for (int anotherCourseIndex : graph.get(courseIndex)) {
                inDegree[anotherCourseIndex]--;
                if (inDegree[anotherCourseIndex] == 0) {
                    queue.add(anotherCourseIndex);
                }
            }
        }

        return resultCount == numCourses ? result : new int[]{};
    }
}
