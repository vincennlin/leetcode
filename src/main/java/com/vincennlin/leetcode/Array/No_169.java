package com.vincennlin.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class No_169 {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {

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
