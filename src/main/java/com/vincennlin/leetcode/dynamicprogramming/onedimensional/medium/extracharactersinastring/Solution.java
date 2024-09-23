package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.extracharactersinastring;

import java.util.Arrays;

// 2707
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Node root = new Node();
        for (String str : dictionary) {
            insert(root, str);
        }

        int m = s.length();
        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < i; j++) {
                if (search(s.substring(j, i), root)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                } else {
                    dp[i] = Math.min(dp[i], dp[j] + i - j);
                }
            }
        }

        return dp[m];
    }

    private void insert(Node root, String s) {
        for (char c : s.toCharArray()) {
            int path = c - 'a';
            if (root.children[path] == null) {
                root.children[path] = new Node();
            }
            root = root.children[path];
        }
        root.isEnd = true;
    }

    private boolean search(String s, Node root) {
        for (int i = 0; i < s.length(); i++) {
            int path = s.charAt(i) - 'a';
            if (root.children[path] == null) {
                return false;
            }
            root = root.children[path];
        }
        return root.isEnd;
    }
}

class Node{
    public Node[] children;
    public boolean isEnd;

    Node() {
        children = new Node[26];
    }
}