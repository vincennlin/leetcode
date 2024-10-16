package com.vincennlin.leetcode.heap.medium.longesthappystring;

import java.util.PriorityQueue;
import java.util.Queue;

// 1405
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        Queue<Pair> maxHeap = new PriorityQueue<>((x, y) -> (y.count - x.count));

        if (a > 0) {
            maxHeap.add(new Pair('a', a));
        }
        if (b > 0) {
            maxHeap.add(new Pair('b', b));
        }
        if (c > 0) {
            maxHeap.add(new Pair('c', c));
        }

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();

            int length = sb.length();
            if (length >= 2 && sb.charAt(length - 1) == pair.character && sb.charAt(length - 2) == pair.character) {
                if (maxHeap.isEmpty()) {
                    break;
                }

                Pair temp = maxHeap.poll();
                sb.append(temp.character);

                if (temp.count - 1 > 0) {
                    temp.count--;
                    maxHeap.add(temp);
                }
            } else {
                sb.append(pair.character);
                pair.count--;
            }

            if (pair.count > 0) {
                maxHeap.add(pair);
            }
        }

        return sb.toString();
    }
}

class Pair {
    int count;
    char character;

    Pair(char character, int count) {
        this.character = character;
        this.count = count;
    }
}