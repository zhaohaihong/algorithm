package Tree.BST;

import common.TreeNode;

public class SearchInBST {
    static class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }
            if (root.val == val) {
                return root;
            }
            if (val > root.val) {
                return searchBST(root.right, val);
            }
            if (val < root.val) {
                return searchBST(root.left, val);
            }
            return null;
        }
    }
}
