package com.vincennlin.leetcode.binarytreebfs.easy.averageoflevelsinbunarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//637
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> averageList = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            double levelSum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.remove();
                levelSum += currentNode.val;
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
            averageList.add(levelSum / levelSize);
        }
        return averageList;
    }
}
