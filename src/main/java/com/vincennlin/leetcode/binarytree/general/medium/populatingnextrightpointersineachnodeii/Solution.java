package com.vincennlin.leetcode.binarytree.general.medium.populatingnextrightpointersineachnodeii;

import java.util.LinkedList;
import java.util.Queue;

//117
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int layerNodeNum = nodeQueue.size();
            for (int i = 0; i < layerNodeNum; i++) {
                Node currentNode = nodeQueue.remove();

                if (currentNode.left != null) nodeQueue.add(currentNode.left);
                if (currentNode.right != null) nodeQueue.add(currentNode.right);

                if (i != layerNodeNum - 1) currentNode.next = nodeQueue.peek();
            }
        }
        return root;
    }
}
