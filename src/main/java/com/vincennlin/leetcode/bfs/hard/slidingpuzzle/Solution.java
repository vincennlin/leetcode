package com.vincennlin.leetcode.bfs.hard.slidingpuzzle;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

// 773
class Solution {
    public int slidingPuzzle(int[][] board) {
        int[][] directions = new int[][]{
                {1, 3},
                {0, 2, 4},
                {1, 5},
                {0, 4},
                {1, 3, 5},
                {2, 4}
        };
        String answer = "123450";
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) {
                sb.append(num);
            }
        }
        String start = sb.toString();
        queue.add(start);
        visited.add(start);

        int level = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize-- > 0){
                String current = queue.poll();
                if (current.equals(answer)) {
                    return level;
                }
                int zeroIndex = current.indexOf('0');
                for (int direction : directions[zeroIndex]) {
                    String next = swap(current, zeroIndex, direction);
                    if (!visited.contains(next)) {
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
            level++;
        }

        return -1;
    }

    private String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
