package com.vincennlin.leetcode.binarytree.dfs.hard.recoveratreefrompreordertraversal;

import java.util.LinkedList;
import java.util.Queue;

// 1028
class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        TreeNode root = new TreeNode();
        Queue<Character> charQueue = new LinkedList<>();

        for (char c : traversal.toCharArray()) {
            charQueue.add(c);
        }

        dfs(charQueue, root, 0);

        return root;
    }

    private void dfs(Queue<Character> charQueue, TreeNode root, int depth) {
        if (charQueue.isEmpty() || root == null) {
            return;
        }

        int val = getValFromQueue(charQueue);
        int nextDepth = getDepthFromQueue(charQueue, false);

        if (nextDepth > depth) {
            getDepthFromQueue(charQueue, true);
            TreeNode leftChild = new TreeNode();
            root.left = leftChild;
            dfs(charQueue, leftChild, nextDepth);
        }
    }

    private int getValFromQueue(Queue<Character> charQueue) {
        int val = 0;

        while (!charQueue.isEmpty() && Character.isDigit(charQueue.peek())) {
            val = 10 * val + charQueue.poll();
        }

        return val;
    }

    private int getDepthFromQueue(Queue<Character> charQueue, boolean isRemove) {
        int depth = 0;

        while (!charQueue.isEmpty() && charQueue.peek() == '-') {
            depth++;
            charQueue.poll();
        }

        return depth;
    }
}