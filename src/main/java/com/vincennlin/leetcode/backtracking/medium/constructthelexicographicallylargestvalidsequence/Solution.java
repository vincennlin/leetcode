package com.vincennlin.leetcode.backtracking.medium.constructthelexicographicallylargestvalidsequence;

import java.util.ArrayList;
import java.util.List;

// 1718
class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1];

        List<Integer> tempList = new ArrayList<>();
        tempList.add(n);

        int[] freq = new int[n];
        freq[n - 1]++;

        backtracking(tempList, freq, n);

        for (int i = 0; i < result.length; i++) {
            result[i] = tempList.get(i);
        }

        return result;
    }

    private void backtracking(List<Integer> tempList, int[] freq, int n) {
        for (int nextNum = n; nextNum >= 1; nextNum--) {
            tempList.add(nextNum);
            freq[nextNum - 1]++;
            if (isValid(tempList, freq)) {
                backtracking(tempList, freq, n);
                if (tempList.size() == 2 * n - 1) {
                    return;
                }
            }
            tempList.remove(tempList.size() - 1);
            freq[nextNum - 1]--;
        }
    }

    private boolean isValid(List<Integer> tempList, int[] freq) {
        int lastNum = tempList.get(tempList.size() - 1);

        if (lastNum == 1) {
            return freq[0] == 1;
        } else {
            int size = tempList.size();
            return freq[lastNum - 1] == 1 ||
                    (freq[lastNum - 1] == 2 && size > lastNum && tempList.get(size - 1 - lastNum) == lastNum);
        }
    }
}