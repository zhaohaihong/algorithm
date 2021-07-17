package Tree;

import common.TreeNode;

public class BalancedBinaryTree {
    static class Solution {
        boolean result = true;

        public boolean isBalanced(TreeNode root) {
            maxDepth(root);
            return result;
        }

        public int maxDepth(TreeNode treeNode) {
            if (treeNode == null) {
                return 0;
            }
            int l = maxDepth(treeNode.left);
            int r = maxDepth(treeNode.right);
            if (Math.abs(l - r) > 1) {
                result = false;
            }
            return 1 + Math.max(l, r);
        }
    }
}
