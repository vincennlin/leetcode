package com.vincennlin.leetcode.binarytreegeneral.medium.lowestcommonancestorofabinarytree;
//236
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val == p.val || root.val == q.val) return root;

        TreeNode leftLca = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLca = lowestCommonAncestor(root.right, p, q);

        if (leftLca != null && rightLca != null) return root;
        if (leftLca != null) {
            return leftLca;
        } else {
            return rightLca;
        }
    }
}
