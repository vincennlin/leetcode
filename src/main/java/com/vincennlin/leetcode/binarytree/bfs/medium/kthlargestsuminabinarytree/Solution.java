package com.vincennlin.leetcode.binarytree.bfs.medium.kthlargestsuminabinarytree;

import java.util.*;

// 2583
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                sum += node.val;
            }
            pq.add(sum);
        }

        if (k > pq.size()) {
            return -1;
        }

        long result = 0;
        while (k != 0) {
            result = pq.poll();
            k--;
        }

        return result;
    }
}
