package com.vincennlin.leetcode.backtracking.medium.coursechedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 207
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }

        int learnedCount = 0;
        while (!queue.isEmpty()) {
            int courseIndex = queue.poll();
            for (int anotherCourseIndex : graph.get(courseIndex)) {
                inDegree[anotherCourseIndex]--;
                if (inDegree[anotherCourseIndex] == 0) queue.add(anotherCourseIndex);
            }
            learnedCount++;
        }

        return learnedCount == numCourses;
    }
}
