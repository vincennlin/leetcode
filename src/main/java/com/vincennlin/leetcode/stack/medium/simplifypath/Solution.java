package com.vincennlin.leetcode.stack.medium.simplifypath;

import java.util.ArrayDeque;
import java.util.Deque;

//71
class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        Deque<String> pathStack = new ArrayDeque<>();

        for (String currentStr : pathArray) {
            if (currentStr.equals("..")) {
                if (!pathStack.isEmpty()) pathStack.pop();
            } else if (!currentStr.equals(".") && !currentStr.isEmpty()) {
                pathStack.push(currentStr);
            }
        }

        if (pathStack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        while (!pathStack.isEmpty()) {
            sb.insert(0, "/" + pathStack.pop());
        }

        return sb.toString();
    }
}
