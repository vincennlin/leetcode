package com.vincennlin.leetcode.stack.medium.simplifypath;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//71
class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        Stack<String> pathStack = new Stack<>();

        for (String currentStr : pathArray) {
            if (currentStr.equals("..")) {
                if (!pathStack.isEmpty()) pathStack.pop();
            } else if (!currentStr.equals(".") && !currentStr.isEmpty()) {
                pathStack.push(currentStr);
            }
        }

        List<String> pathList = new LinkedList<>(pathStack);
        StringBuilder sb = new StringBuilder();

        while (!pathList.isEmpty()) {
            String str = pathList.remove(0);
            sb.append("/").append(str);
        }
        if (sb.isEmpty()) sb.append("/");

        return sb.toString();
    }
}
