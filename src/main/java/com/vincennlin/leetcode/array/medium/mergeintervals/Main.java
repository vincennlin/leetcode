package com.vincennlin.leetcode.array.medium.mergeintervals;
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] intervals1 = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result1 = solution.merge(intervals1);
        for (int[] interval : result1) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        System.out.println();

        int[][] intervals2 = new int[][]{{1, 4}, {4, 5}};
        int[][] result2 = solution.merge(intervals2);
        for (int[] interval : result2) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
