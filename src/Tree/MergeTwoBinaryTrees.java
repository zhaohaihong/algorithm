package Tree;

import common.TreeNode;

public class MergeTwoBinaryTrees {
    static class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            return merge(root1, root2);
        }

        public TreeNode merge(TreeNode node1, TreeNode node2) {
            if (node1 == null && node2 == null) {
                return null;
            }
            if (node1 != null && node2 != null) {
                TreeNode root = new TreeNode(node1.val + node2.val);
                root.left = merge(node1.left, node2.left);
                root.right = merge(node1.right, node2.right);
                return root;
            }
            return node1 == null ? node2 : node1;
        }
    }
}
