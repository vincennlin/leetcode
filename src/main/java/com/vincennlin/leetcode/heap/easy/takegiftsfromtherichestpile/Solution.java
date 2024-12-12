package com.vincennlin.leetcode.heap.easy.takegiftsfromtherichestpile;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// 2558
class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int gift : gifts) {
            heap.add(gift);
        }

        for (int i = 0; i < k; i++) {
            int maxGift = heap.poll();
            heap.add((int) Math.sqrt(maxGift));
        }

        long result = 0;
        for (int pile : heap) {
            result += pile;
        }

        return result;
    }
}