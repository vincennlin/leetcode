package com.vincennlin.leetcode.graphgeneral.medium.clonegraph;

import java.util.HashMap;
import java.util.Map;

//133
class Solution {
    Map<Node, Node> nodeMap;

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        nodeMap = new HashMap<>();
        return dfs(node);
    }

    private Node dfs(Node node) {
        if (nodeMap.containsKey(node)) return nodeMap.get(node);

        Node clonedNode = new Node(node.val);
        nodeMap.put(node, clonedNode);

        for (Node neighbor : node.neighbors) {
            clonedNode.neighbors.add(dfs(neighbor));
        }

        return clonedNode;
    }
}
