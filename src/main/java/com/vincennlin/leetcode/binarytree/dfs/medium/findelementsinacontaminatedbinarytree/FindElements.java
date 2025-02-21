package com.vincennlin.leetcode.binarytree.dfs.medium.findelementsinacontaminatedbinarytree;

import java.util.HashSet;
import java.util.Set;

// 1261
class FindElements {
    private final Set<Integer> valSet;

    public FindElements(TreeNode root) {
        valSet = new HashSet<>();
        dfs(root, 0);
    }

    public boolean find(int target) {
        return this.valSet.contains(target);
    }

    private void dfs(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        root.val = val;
        this.valSet.add(val);
        dfs(root.left, 2 * val + 1);
        dfs(root.right, 2 * val + 2);
    }
}