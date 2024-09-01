package com.vincennlin.leetcode.stack.medium.asteroidcollision;

import java.util.Deque;
import java.util.LinkedList;

// 735
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new LinkedList<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;

            while (!deque.isEmpty() && asteroid < 0 && deque.peekLast() > 0) {
                int top = deque.peekLast();

                if (top < -asteroid) {
                    deque.removeLast();
                } else if (top > -asteroid) {
                    exploded = true;
                    break;
                } else {
                    deque.removeLast();
                    exploded = true;
                    break;
                }
            }

            if (!exploded) {
                deque.addLast(asteroid);
            }
        }

        int[] result = new int[deque.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = deque.removeFirst();
        }

        return result;
    }
}
