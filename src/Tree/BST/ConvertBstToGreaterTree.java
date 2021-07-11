package Tree.BST;

import common.TreeNode;

public class ConvertBstToGreaterTree {
    static class Solution {
        int sum;

        public TreeNode convertBST(TreeNode root) {
            traverse(root);
            return root;
        }

        public void traverse(TreeNode treeNode) {
            if (treeNode == null) {
                return;
            }
            traverse(treeNode.right);
            sum += treeNode.val;
            treeNode.val = sum;
            traverse(treeNode.left);
        }
    }
}
