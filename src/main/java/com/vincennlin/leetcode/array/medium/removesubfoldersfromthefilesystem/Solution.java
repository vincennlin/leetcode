package com.vincennlin.leetcode.array.medium.removesubfoldersfromthefilesystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1233
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String prev = folder[0];
        List<String> result = new ArrayList<>();
        result.add(prev);

        for (int i = 1; i < folder.length; i++) {
            if (!folder[i].startsWith(prev + '/')) {
                result.add(folder[i]);
                prev = folder[i];
            }
        }

        return result;
    }
}
