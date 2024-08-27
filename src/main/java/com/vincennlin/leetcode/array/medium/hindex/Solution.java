package com.vincennlin.leetcode.array.medium.hindex;

import java.util.Arrays;
import java.util.Comparator;

//274
class Solution {
    public int hIndex(int[] citations) {
        int[] countArray = new int[1001];
        int[] accumulatedArray = new int[1001];

        for (int num : citations) {
            countArray[num]++;
        }
        accumulatedArray[0] = countArray[0];
        for (int i = 1; i < 1001; i++) {
            accumulatedArray[i] = accumulatedArray[i-1] + countArray[i];
        }

        for (int i = 1000; i > 0; i--) {
            // 引用次數大於等於 i 的論文數量如果大於 i ，返回 i
            if (accumulatedArray[1000] - accumulatedArray[i - 1] >= i) {
                return i;
            }
        }
        return 0;
    }
}
// 0 1 3 5 6
// 0 1 2 3 4 5 6
// 1 2 2 3 3 4 5

// 0 0 0 1 3 1
// 0 1 2 3
// 3 5 5 6