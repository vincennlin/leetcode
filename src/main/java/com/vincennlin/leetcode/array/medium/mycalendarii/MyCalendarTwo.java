package com.vincennlin.leetcode.array.medium.mycalendarii;

import java.util.ArrayList;
import java.util.List;

// 731
class MyCalendarTwo {

    private List<int[]> calendar;
    private List<int[]> overlap;

    public MyCalendarTwo() {
        this.calendar = new ArrayList<>();
        this.overlap = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] overlapEvent : overlap) {
            int overlapStart = overlapEvent[0];
            int overlapEnd = overlapEvent[1];
            if (start < overlapEnd && end > overlapStart) {
                return false;
            }
        }

        for (int[] event : calendar) {
            int calStart = event[0];
            int calEnd = event[1];
            if (start < calEnd && end > calStart) {
                int newOverLapStart = Math.max(start, calStart);
                int newOverLapEnd = Math.min(end, calEnd);
                overlap.add(new int[]{newOverLapStart, newOverLapEnd});
            }
        }

        calendar.add(new int[]{start, end});

        return true;
    }
}
