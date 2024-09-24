package com.vincennlin.leetcode.trie.medium.findthelengthofthelongestcommonprefix;
// 3043
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Node root = new Node();
        for (int num1 : arr1) {
            insert(root, num1);
        }

        int longest = 0;
        for (int num2 : arr2) {
            longest = Math.max(longest, searchDepth(root, num2));
        }

        return longest;
    }

    private void insert(Node root, int num) {
        String str = String.valueOf(num);
        for (char c : str.toCharArray()) {
            int path = c - '0';
            if (root.children[path] == null) {
                root.children[path] = new Node();
            }
            root = root.children[path];
        }
        root.isEnd = true;
    }

    private int searchDepth(Node root, int num) {
        int depth = 0;
        String str = String.valueOf(num);
        for (char c : str.toCharArray()) {
            int path = c - '0';
            if (root.children[path] == null) {
                return depth;
            }
            root = root.children[path];
            depth++;
        }
        return depth;
    }
}

class Node{
    public Node[] children;
    public boolean isEnd;

    Node() {
        children = new Node[10];
    }
}