package com.vincennlin.leetcode.queue.easy.numberofrecentcalls;

import java.util.LinkedList;
import java.util.Queue;

// 933
class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.add(t);

        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }

        return queue.size();
    }
}
