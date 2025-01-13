package com.vincennlin.leetcode.stack.medium.checkifaparenthesesstringcanbevalid;

import java.util.ArrayDeque;
import java.util.Deque;

// 2116
class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();

        if (n % 2 == 1) {
            return false;
        }

        Deque<Integer> lockedLeft = new ArrayDeque<>();
        Deque<Integer> unlocked = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') { // unlocked
                unlocked.push(i);
            } else { // locked
                if (s.charAt(i) == '(') { // locked '('
                    lockedLeft.push(i);
                } else { // locked ')'
                    if (!lockedLeft.isEmpty()) {
                        lockedLeft.pop();
                    } else if (!unlocked.isEmpty()) {
                        unlocked.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        while (!lockedLeft.isEmpty() && !unlocked.isEmpty() && lockedLeft.peek() < unlocked.peek()) {
            lockedLeft.pop();
            unlocked.pop();
        }

        return lockedLeft.isEmpty();
    }
}