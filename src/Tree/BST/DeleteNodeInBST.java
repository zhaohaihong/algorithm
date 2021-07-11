package Tree.BST;

import common.TreeNode;

public class DeleteNodeInBST {
    static class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (root.val == key) {
                if (root.left == null) {
                    return root.right;
                }
                if (root.right == null) {
                    return root.left;
                }
                TreeNode minNode = getMinNode(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right, minNode.val);
            } else if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                root.right = deleteNode(root.right, key);
            }
            return root;
        }

        public TreeNode getMinNode(TreeNode treeNode) {
            while (treeNode.left != null) {
                treeNode = treeNode.left;
            }
            return treeNode;
        }
    }
}
