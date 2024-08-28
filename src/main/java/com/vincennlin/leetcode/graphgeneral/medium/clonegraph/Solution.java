package com.vincennlin.leetcode.graphgeneral.medium.clonegraph;

import java.util.HashMap;
import java.util.Map;

//133
class Solution {
    Map<Node, Node> nodeMap;

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        nodeMap = new HashMap<>();
        dfs(node);
        return nodeMap.get(node);
    }

    private void dfs(Node node) {
        if (!nodeMap.containsKey(node)) {
            Node clonedNode = new Node(node.val);
            nodeMap.put(node, clonedNode);
            for (Node neighbor : node.neighbors) {
                dfs(neighbor);
                clonedNode.neighbors.add(nodeMap.get(neighbor));
            }
        }
    }
}
