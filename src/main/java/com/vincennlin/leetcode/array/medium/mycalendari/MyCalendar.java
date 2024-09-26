package com.vincennlin.leetcode.array.medium.mycalendari;

import java.util.ArrayList;
import java.util.List;

// 729
class MyCalendar {

    List<int[]> calendar;

    public MyCalendar() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (calendar.isEmpty()) {
            calendar.add(new int[]{start, end});
        } else {
            for (int[] event : calendar) {
                if (start < event[1] && end > event[0]) {
                    return false;
                }
            }
            calendar.add(new int[]{start, end});
        }
        return true;
    }
}
