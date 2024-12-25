package com.vincennlin.leetcode.binarytree.bfs.medium.findlargestvalueineachtreerow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 515
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty() && queue.peek() != null) {
            int rowSize = queue.size();
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < rowSize; i++) {
                TreeNode node = queue.poll();
                largest = Math.max(largest, node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(largest);
        }

        return result;
    }
}