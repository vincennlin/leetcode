package com.vincennlin.leetcode.string.medium.findkthbitinnthbinarystring;

import java.util.ArrayList;
import java.util.List;

// 1545
class Solution {
    public char findKthBit(int n, int k) {
        List<Character> list = new ArrayList<>();
        list.add('0');
        recursion(list, n, k);
        return list.get(k - 1);
    }

    private void recursion(List<Character> list, int n, int k) {
        if (n == 1) {
            return;
        }

        int size = list.size();

        list.add('1');
        for (int i = size - 1; i >= 0; i--) {
            list.add(list.get(i) == '0' ? '1' : '0');
        }
        recursion(list, n - 1, k);
    }
}