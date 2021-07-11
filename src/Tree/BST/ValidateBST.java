package Tree.BST;

import common.TreeNode;

public class ValidateBST {
    static class Solution {
        public boolean isValidBST(TreeNode root) {
            return valid(root, null, null);
        }

        public boolean valid(TreeNode treeNode, TreeNode min, TreeNode max) {
            if (treeNode == null) {
                return true;
            }
            if (min != null && treeNode.val <= min.val) {
                return false;
            }
            if (max != null && treeNode.val >= max.val) {
                return false;
            }
            return valid(treeNode.left, min, treeNode) && valid(treeNode.right, treeNode, max);
        }
    }
}
