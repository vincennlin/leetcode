package com.vincennlin.leetcode.binarytree.dfs.medium.findelementsinacontaminatedbinarytree;
/*
Given a binary tree with the following rules:

root.val == 0
For any treeNode:
If treeNode.val has a value x and treeNode.left != null, then treeNode.left.val == 2 * x + 1
If treeNode.val has a value x and treeNode.right != null, then treeNode.right.val == 2 * x + 2
Now the binary tree is contaminated, which means all treeNode.val have been changed to -1.

Implement the FindElements class:

FindElements(TreeNode* root) Initializes the object with a contaminated binary tree and recovers it.
bool find(int target) Returns true if the target value exists in the recovered binary tree.


Example 1:


Input
["FindElements","find","find"]
[[[-1,null,-1]],[1],[2]]
Output
[null,false,true]
Explanation
FindElements findElements = new FindElements([-1,null,-1]);
findElements.find(1); // return False
findElements.find(2); // return True
Example 2:


Input
["FindElements","find","find","find"]
[[[-1,-1,-1,-1,-1]],[1],[3],[5]]
Output
[null,true,true,false]
Explanation
FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
findElements.find(1); // return True
findElements.find(3); // return True
findElements.find(5); // return False
Example 3:


Input
["FindElements","find","find","find","find"]
[[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
Output
[null,true,false,false,true]
Explanation
FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
findElements.find(2); // return True
findElements.find(3); // return False
findElements.find(4); // return False
findElements.find(5); // return True


Constraints:

TreeNode.val == -1
The height of the binary tree is less than or equal to 20
The total number of nodes is between [1, 104]
Total calls of find() is between [1, 104]
0 <= target <= 106
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(-1);
        root1.right = new TreeNode(-1);
        FindElements findElements1 = new FindElements(root1);
        System.out.println(findElements1.find(1)); // false
        System.out.println(findElements1.find(2)); // true

        System.out.println();

        TreeNode root2 = new TreeNode(-1);
        root2.left = new TreeNode(-1);
        root2.right = new TreeNode(-1);
        root2.left.left = new TreeNode(-1);
        root2.left.right = new TreeNode(-1);
        FindElements findElements2 = new FindElements(root2);
        System.out.println(findElements2.find(1)); // true
        System.out.println(findElements2.find(3)); // true
        System.out.println(findElements2.find(5)); // false

        System.out.println();

        TreeNode root3 = new TreeNode(-1);
        root3.right = new TreeNode(-1);
        root3.right.left = new TreeNode(-1);
        root3.right.left.left = new TreeNode(-1);
        FindElements findElements3 = new FindElements(root3);
        System.out.println(findElements3.find(2)); // true
        System.out.println(findElements3.find(3)); // false
        System.out.println(findElements3.find(4)); // false
        System.out.println(findElements3.find(5)); // true
    }
}
