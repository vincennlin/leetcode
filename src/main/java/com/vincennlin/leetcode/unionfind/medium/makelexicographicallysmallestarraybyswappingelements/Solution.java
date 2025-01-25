package com.vincennlin.leetcode.unionfind.medium.makelexicographicallysmallestarraybyswappingelements;

import java.util.*;

// 2948
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] numsSorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsSorted);

        int currGroup = 0;
        Map<Integer, Integer> numToGroup = new HashMap<>();
        numToGroup.put(numsSorted[0], currGroup);

        Map<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
        groupToList.put(currGroup, new LinkedList<>(Arrays.asList(numsSorted[0])));

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(numsSorted[i] - numsSorted[i - 1]) > limit) {
                currGroup++;
            }

            numToGroup.put(numsSorted[i], currGroup);

            if (!groupToList.containsKey(currGroup)) {
                groupToList.put(currGroup, new LinkedList<>());
            }
            groupToList.get(currGroup).add(numsSorted[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            nums[i] = groupToList.get(group).pop();
        }

        return nums;
    }
}