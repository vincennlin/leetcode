package com.vincennlin.leetcode.array.easy.kthdistinctstringinanarray;

import java.util.HashMap;
import java.util.Map;
//2053
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int count = 0;
        for (String str : arr) {
            if (map.get(str) == 1) {
                if (k == ++count) {
                    return str;
                }
            }
        }
        return "";
    }
}
