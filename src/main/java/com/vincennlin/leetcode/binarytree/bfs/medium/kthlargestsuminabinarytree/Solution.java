package com.vincennlin.leetcode.binarytree.bfs.medium.kthlargestsuminabinarytree;

import java.util.*;

// 2583
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sumList = new ArrayList<>();
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
            sumList.add(sum);
        }

        sumList.sort(Comparator.reverseOrder());

        return k <= sumList.size() ? sumList.get(k - 1) : -1;
    }
}
