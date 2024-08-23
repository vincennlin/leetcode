package com.vincennlin.leetcode.binarytreebfs.medium.binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//102
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelNodesList = new ArrayList<>();
        if (root == null) return levelNodesList;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int levelNodesCount = nodeQueue.size();

            for (int i = 0; i < levelNodesCount; i++) {
                TreeNode currentNode = nodeQueue.poll();
                if (currentNode.left != null) nodeQueue.add(currentNode.left);
                if (currentNode.right != null) nodeQueue.add(currentNode.right);
                levelNodes.add(currentNode.val);
            }
            levelNodesList.add(levelNodes);
        }

        return levelNodesList;
    }
}
