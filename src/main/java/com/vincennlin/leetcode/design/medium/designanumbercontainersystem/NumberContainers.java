package com.vincennlin.leetcode.design.medium.designanumbercontainersystem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// 2349
class NumberContainers {

    Map<Integer, Integer> indexNumberMap;
    Map<Integer, Queue<Integer>> numberIndexQueueMap;

    public NumberContainers() {
        indexNumberMap = new HashMap<>();
        numberIndexQueueMap = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexNumberMap.containsKey(index)) {
            int prevNumber = indexNumberMap.get(index);
            numberIndexQueueMap.get(prevNumber).remove(index);
            if (numberIndexQueueMap.get(prevNumber).isEmpty()) {
                numberIndexQueueMap.remove(prevNumber);
            }
        }

        indexNumberMap.put(index, number);

        if (!numberIndexQueueMap.containsKey(number)) {
            numberIndexQueueMap.put(number, new PriorityQueue<>());
        }
        numberIndexQueueMap.get(number).add(index);
    }

    public int find(int number) {
        Queue<Integer> queue = numberIndexQueueMap.get(number);
        return (queue == null || queue.peek() == null) ? -1 : queue.peek();
    }
}
