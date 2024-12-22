package com.vincennlin.leetcode.monotonicstack.hard.findbuildingwherealiceandbobcanmeet;

import java.util.ArrayDeque;
import java.util.Deque;

// 2940
class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] nextTallerIndexes = getTallerIndexes(heights, 0);

        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] > queries[i][1]) {
                int temp = queries[i][0];
                queries[i][0] = queries[i][1];
                queries[i][1] = temp;
            }
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            if (query[0] == query[1] || heights[query[1]] > heights[query[0]]) {
                result[i] = query[1];
            } else {
                if (nextTallerIndexes[query[0]] == -1 || nextTallerIndexes[query[1]] == -1) {
                    result[i] = -1;
                } else if (nextTallerIndexes[query[0]] >= query[1]){
                    result[i] = nextTallerIndexes[query[0]];
                } else { // query[0] 的下一個最高樓在 query[1] 之前，必須把 query[1] 的高度當成 query[0] 重新找一次
                    int temp = heights[query[1]];
                    heights[query[1]] = heights[query[0]];
                    result[i] = getTallerIndexes(heights, query[1])[query[1]];
                    heights[query[1]] = temp;
                }
            }
        }

        return result;
    }

    private int[] getTallerIndexes(int[] heights, int start) {
        int[] nextTallerIndexes = new int[heights.length];
        Deque<Integer> monoStack = new ArrayDeque<>();

        for (int i = heights.length - 1; i >= start; i--) {
            int height = heights[i];
            if (monoStack.isEmpty() || height < heights[monoStack.peek()]) {
                nextTallerIndexes[i] = monoStack.isEmpty() ? -1 : monoStack.peek();
                monoStack.push(i);
            } else {
                while (!monoStack.isEmpty() && height >= heights[monoStack.peek()]) {
                    monoStack.pop();
                }
                nextTallerIndexes[i] = monoStack.isEmpty() ? -1 : monoStack.peek();
                monoStack.push(i);
            }
        }

        return nextTallerIndexes;
    }
}