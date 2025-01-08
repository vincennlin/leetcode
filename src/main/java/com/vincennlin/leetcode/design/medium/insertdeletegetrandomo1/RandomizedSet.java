package com.vincennlin.leetcode.design.medium.insertdeletegetrandomo1;

import java.util.*;

// 380
class RandomizedSet {

    Map<Integer, Integer> elementIndexMap;
    List<Integer> elements;

    public RandomizedSet() {
        elementIndexMap = new HashMap<>();
        elements = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!elementIndexMap.containsKey(val)) {
            elementIndexMap.put(val, elements.size());
            elements.add(val);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int val) {
        if (elementIndexMap.containsKey(val)) {
            int indexToRemove = elementIndexMap.get(val);
            int size = elements.size();
            elements.set(indexToRemove, elements.get(size - 1));
            elementIndexMap.put(elements.get(indexToRemove), indexToRemove);
            elements.remove(size - 1);
            elementIndexMap.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int size = elements.size();
        int randomIndex = (int) (Math.random() * size);
        return elements.get(randomIndex);
    }
}

