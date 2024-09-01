package com.vincennlin.leetcode.binarytree.dfs.leafsimilartrees;

import java.util.ArrayList;
import java.util.List;

// 872
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> root1LeafValues = new ArrayList<>();
        dfs(root1, root1LeafValues);

        List<Integer> root2LeafValues = new ArrayList<>();
        dfs(root2, root2LeafValues);

        return root1LeafValues.equals(root2LeafValues);
    }

    private void dfs(TreeNode currentNode, List<Integer> leafValues) {
        if (currentNode.left == null && currentNode.right == null) {
            leafValues.add(currentNode.val);
        } else {
            if (currentNode.left != null) {
                dfs(currentNode.left, leafValues);
            }
            if (currentNode.right != null) {
                dfs(currentNode.right, leafValues);
            }
        }
    }
}
