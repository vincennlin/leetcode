package com.vincennlin.leetcode.binarytreebfs.medium.binarytreerightsideview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//199
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int levelSize = nodeQueue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = nodeQueue.poll();

                if (i == 0) result.add(currentNode.val);

                if (currentNode.right != null) nodeQueue.add(currentNode.right);
                if (currentNode.left != null) nodeQueue.add(currentNode.left);
            }
        }

        return result;
    }
}
