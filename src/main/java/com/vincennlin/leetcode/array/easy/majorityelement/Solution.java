package com.vincennlin.leetcode.array.easy.majorityelement;

import java.util.HashMap;
import java.util.Map;
//169
class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer num: map.keySet()) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;

    }

}
