package com.vincennlin.leetcode.heap.kthlargestelementinanarray;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<Integer> heap;

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent (int index) {
        return (index - 1) / 2;
    }

    private void swap (int index1, int index2) {
        if (index1 > heap.size() - 1 || index2 > heap.size() - 1) return;
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    private void insert(int value) {
        heap.add(value);
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parent(currentIndex))) {
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }

    private void sinkDown(int index) {
        int maxIndex = index;
        int leftIndex = leftChild(index);
        int rightIndex= rightChild(index);

        if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
            maxIndex = leftIndex;
        }
        if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
            maxIndex = rightIndex;
        }

        if (maxIndex != index) {
            swap(index, maxIndex);
            sinkDown(maxIndex);
        }
    }

    private Integer remove() {
        if (heap.size() == 0) return null;
        if (heap.size() == 1) return heap.remove(0);

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return maxValue;
    }

    public int findKthLargest(int[] nums, int k) {

        heap = new ArrayList<>();

        for (int num : nums) {
            insert(num);
        }

        while (k > 1) {
            remove();
            k--;
        }

        return remove();
    }
}