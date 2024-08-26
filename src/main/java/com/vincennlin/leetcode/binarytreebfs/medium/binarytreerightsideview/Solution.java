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
            int layerSize = nodeQueue.size();

            for (int i = 0; i < layerSize; i++) {
                TreeNode currentNode = nodeQueue.poll();
                if (currentNode == null) continue;
                if (currentNode.left != null) nodeQueue.add(currentNode.left);
                if (currentNode.right != null) nodeQueue.add(currentNode.right);

                if (i == layerSize - 1) result.add(currentNode.val);
            }
        }

        return result;
    }
}
