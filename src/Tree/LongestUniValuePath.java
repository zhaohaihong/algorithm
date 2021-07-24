package Tree;

import common.TreeNode;

public class LongestUniValuePath {
    static class Solution {
        int path = 0;

        public int longestUnivaluePath(TreeNode root) {
            dfs(root);
            return path;
        }

        public int dfs(TreeNode treeNode) {
            if (treeNode == null) {
                return 0;
            }
            int left = dfs(treeNode.left);
            int right = dfs(treeNode.right);
            int leftPath = treeNode.left != null && treeNode.left.val == treeNode.val ? left + 1 : 0;
            int rightPath = treeNode.right != null && treeNode.right.val == treeNode.val ? right + 1 : 0;
            path = Math.max(path, leftPath + rightPath);
            return Math.max(leftPath, rightPath);
        }
    }
}
