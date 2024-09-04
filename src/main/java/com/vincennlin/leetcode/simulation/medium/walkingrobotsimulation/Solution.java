package com.vincennlin.leetcode.simulation.medium.walkingrobotsimulation;

import java.util.HashSet;
import java.util.Set;

// 874
class Solution {

    private static final int HASH_MULTIPLIER = 60001;

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Integer> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(hashCoordinates(obstacle[0], obstacle[1]));
        }

        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir_index = 0;

        int[] position = new int[]{0, 0};
        int maxDistanceSquare = 0;

        for (int command : commands) {
            if (command < 0) {
                if (command == - 1) {
                    dir_index = (dir_index + 1) % 4;
                } else {
                    dir_index = (dir_index + 3) % 4;
                }
            } else {
                for (int i = 0; i < command; i++) {
                    int nextX = position[0] + directions[dir_index][0];
                    int nextY = position[1] + directions[dir_index][1];
                    if (obstacleSet.contains(hashCoordinates(nextX, nextY))) {
                        break;
                    } else {
                        position[0] = nextX;
                        position[1] = nextY;
                        maxDistanceSquare = Math.max(position[0] * position[0] + position[1] * position[1], maxDistanceSquare);
                    }
                }
            }
        }

        return maxDistanceSquare;
    }

    private int hashCoordinates(int x, int y) {
        return x + HASH_MULTIPLIER * y;
    }
}
