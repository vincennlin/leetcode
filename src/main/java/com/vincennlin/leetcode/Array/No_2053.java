package com.vincennlin.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class No_2053 {

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr, 1));
    }

    public static String kthDistinct(String[] arr, int k) {
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
