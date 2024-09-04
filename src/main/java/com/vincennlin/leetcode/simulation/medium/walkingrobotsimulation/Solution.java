package com.vincennlin.leetcode.simulation.medium.walkingrobotsimulation;

import java.util.HashSet;
import java.util.Set;

// 874
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir_index = 0;

        int[] position = new int[]{0, 0};
        int maxDistanceSquare = 0;

        for (int command : commands) {
            if (command < 0) {
                dir_index += command == -1 ? 1 : -1;
                if (dir_index < 0) {
                    dir_index = 3;
                } else if (dir_index > 3) {
                    dir_index = 0;
                }
            } else {
                for (int i = 0; i < command; i++) {
                    int[] nextPosition = new int[]{position[0] + directions[dir_index][0], position[1] + directions[dir_index][1]};
                    if (obstacleSet.contains(nextPosition[0] + "," + nextPosition[1])) {
                        break;
                    } else {
                        position = nextPosition;
                        maxDistanceSquare = Math.max(position[0] * position[0] + position[1] * position[1], maxDistanceSquare);
                    }
                }
            }
        }

        return maxDistanceSquare;
    }
}
