package com.vincennlin.leetcode.hashtable.easy.checkifnanditsdoubleexist;

import java.util.HashSet;
import java.util.Set;

// 1346
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}