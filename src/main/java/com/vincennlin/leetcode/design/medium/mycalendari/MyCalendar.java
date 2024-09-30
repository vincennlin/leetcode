package com.vincennlin.leetcode.design.medium.mycalendari;

import java.util.Map;
import java.util.TreeMap;

// 729
class MyCalendar {

    TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> prev = calendar.floorEntry(start);
        Map.Entry<Integer, Integer> next = calendar.ceilingEntry(start);

        if ((prev == null || prev.getValue() <= start) &&
                ((next == null || next.getKey() >= end))) {
            calendar.put(start, end);
            return true;
        } else {
            return false;
        }
    }
}
