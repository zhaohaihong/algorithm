package Tree.BST;

import common.TreeNode;

public class kthSmallestElementInABST {
    static class Solution {
        int index = 0;
        int k;
        int res;

        public int kthSmallest(TreeNode root, int k) {
            this.k = k;
            traverse(root);
            return res;
        }

        public void traverse(TreeNode treeNode) {
            if (treeNode == null) {
                return;
            }
            traverse(treeNode.left);
            index++;
            if (index == k) {
                res = treeNode.val;
            }
            traverse(treeNode.right);
        }
    }
}
