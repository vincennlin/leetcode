package com.vincennlin.leetcode.binarytree.bfs.medium.binarytreezigzaglevelordertraversal;

import java.util.*;

//103
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> nodeDeque = new LinkedList<>();
        nodeDeque.add(root);
        boolean leftToRightOrder = true;

        while (!nodeDeque.isEmpty()) {
            int levelSize = nodeDeque.size();
            List<Integer> levelValues = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = leftToRightOrder ? nodeDeque.removeFirst() : nodeDeque.removeLast();
                levelValues.add(0, currentNode.val);
                if (leftToRightOrder) {
                    if (currentNode.right != null) nodeDeque.addLast(currentNode.right);
                    if (currentNode.left != null) nodeDeque.addLast(currentNode.left);
                } else {
                    if (currentNode.left != null) nodeDeque.addFirst(currentNode.left);
                    if (currentNode.right != null) nodeDeque.addFirst(currentNode.right);
                }
            }

            result.add(levelValues);
            leftToRightOrder = !leftToRightOrder;
        }

        return result;
    }
}
