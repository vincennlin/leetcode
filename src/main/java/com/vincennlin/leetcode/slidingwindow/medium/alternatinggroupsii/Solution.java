package com.vincennlin.leetcode.slidingwindow.medium.alternatinggroupsii;

import java.util.ArrayList;
import java.util.List;

// 3208
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        List<Integer> colorList = new ArrayList<>();

        for (int color : colors) {
            colorList.add(color);
        }

        for (int i = 0; i < k; i++) {
            colorList.add(colors[i]);
        }

        int groups = 0;
        int size = 0;

        for (int i = 1; i < colorList.size(); i++) {
            if (colorList.get(i) != colorList.get(i - 1)) {
                size++;
                if (size == k) {
                    groups++;
                    size--;
                }
            } else {
                size = 1;
            }
        }

        return groups;
    }
}