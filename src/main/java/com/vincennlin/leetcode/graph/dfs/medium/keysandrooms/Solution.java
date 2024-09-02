package com.vincennlin.leetcode.graph.dfs.medium.keysandrooms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

//841
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] isVisited = new boolean[n];
        Deque<Integer> deque = new ArrayDeque<>(rooms.get(0));
        isVisited[0] = true;
        int visited = 1;

        while (!deque.isEmpty()) {
            int roomIndex = deque.poll();
            if (isVisited[roomIndex]) continue;
            visited++;
            deque.addAll(rooms.get(roomIndex));
            isVisited[roomIndex] = true;
        }

        return visited == n;
    }
}