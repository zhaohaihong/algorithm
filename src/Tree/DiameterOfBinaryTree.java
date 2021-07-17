package Tree;

import common.TreeNode;

public class DiameterOfBinaryTree {
    static class Solution {
        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return max;
        }

        public int depth(TreeNode treeNode) {
            if (treeNode == null) {
                return 0;
            }
            int left = depth(treeNode.left);
            int right = depth(treeNode.right);
            max = Math.max(max, left + right);
            return Math.max(left, right) + 1;
        }
    }
}
