package com.vincennlin.leetcode.stack.medium.minimumstringlengthafterremovingsubstrings;

import java.util.ArrayDeque;
import java.util.Deque;

// 2696
class Solution {
    public int minLength(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            deque.add(c);
        }

        return recursive(deque);
    }

    private int recursive(Deque<Character> deque) {
        if (deque.isEmpty()) return 0;
        Deque<Character> tempDeque = new ArrayDeque<>();
        tempDeque.add(deque.pollFirst());

        while (!deque.isEmpty()) {
            if ((tempDeque.peekLast() == 'A' && deque.peekFirst() == 'B') || (tempDeque.peekLast() == 'C' && deque.peekFirst() == 'D')) {
                tempDeque.pollLast();
                deque.pollFirst();
                tempDeque.addAll(deque);
                return recursive(tempDeque);
            } else {
                tempDeque.add(deque.pollFirst());
            }
        }

        return tempDeque.size();
    }
}