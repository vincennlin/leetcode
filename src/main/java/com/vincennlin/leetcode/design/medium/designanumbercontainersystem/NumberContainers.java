package com.vincennlin.leetcode.design.medium.designanumbercontainersystem;

import java.util.*;

// 2349
class NumberContainers {

    Map<Integer, Integer> indexNumberMap;
    Map<Integer, TreeSet<Integer>> numberTreeSetMap;

    public NumberContainers() {
        indexNumberMap = new HashMap<>();
        numberTreeSetMap = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexNumberMap.containsKey(index)) {
            int prevNumber = indexNumberMap.get(index);
            numberTreeSetMap.get(prevNumber).remove(index);
            if (numberTreeSetMap.get(prevNumber).isEmpty()) {
                numberTreeSetMap.remove(prevNumber);
            }
        }

        indexNumberMap.put(index, number);

        if (!numberTreeSetMap.containsKey(number)) {
            numberTreeSetMap.put(number, new TreeSet<>());
        }
        numberTreeSetMap.get(number).add(index);
    }

    public int find(int number) {
        TreeSet<Integer> treeSet = numberTreeSetMap.get(number);
        return (treeSet == null || treeSet.isEmpty()) ? -1 : treeSet.first();
    }
}
