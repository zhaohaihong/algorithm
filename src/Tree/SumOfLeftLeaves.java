package Tree;

import common.TreeNode;

public class SumOfLeftLeaves {
    static class Solution {
        int result = 0;

        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) {
                return result;
            }
            traverse(root);
            return result;
        }

        public void traverse(TreeNode treeNode) {
            if (treeNode == null) {
                return;
            }
            if (treeNode.left != null && treeNode.left.left == null && treeNode.left.right == null) {
                result += treeNode.left.val;
            }
            traverse(treeNode.left);
            traverse(treeNode.right);
        }
    }
}
