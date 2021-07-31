package Tree.BST;

import common.TreeNode;

public class MinimumAbsoluteDifferenceInABST {
    static class Solution {
        private int minDiff = Integer.MAX_VALUE;
        private TreeNode preNode;

        public int getMinimumDifference(TreeNode root) {
            inOrder(root);
            return minDiff;
        }

        private void inOrder(TreeNode treeNode) {
            if (treeNode == null) {
                return;
            }
            inOrder(treeNode.left);
            if (preNode != null) {
                minDiff = Math.min(minDiff, treeNode.val - preNode.val);
            }
            preNode = treeNode;
            inOrder(treeNode.right);
        }
    }
}
