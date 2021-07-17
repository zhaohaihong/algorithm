package Tree.BST;

import common.TreeNode;

public class MaximumSumBST {
    static class Solution {
        int res = 0;

        public int maxSumBST(TreeNode root) {
            if (root == null) {
                return res;
            }
            recursion(root);
            return res;
        }

        public int[] recursion(TreeNode treeNode) {
            int isBST = -1;
            int min = 0;
            int max = 0;
            int sum = 0;
            if (treeNode.left == null && treeNode.right == null) {
                isBST = 1;
                min = treeNode.val;
                max = treeNode.val;
                sum = treeNode.val;
            } else if (treeNode.left != null && treeNode.right != null) {
                int[] l = recursion(treeNode.left);
                int[] r = recursion(treeNode.right);
                if (l[0] == 1 && r[0] == 1 && treeNode.val > l[2] && treeNode.val < l[1]) {
                    isBST = 1;
                    min = l[1];
                    max = r[2];
                    sum += treeNode.val + l[3] + r[3];
                }
            } else if (treeNode.left != null) {
                int[] l = recursion(treeNode.left);
                if (l[0] == 1 && treeNode.val > l[2]) {
                    isBST = 1;
                    min = l[1];
                    max = treeNode.val;
                    sum += treeNode.val + l[3];
                }
            } else {
                int[] r = recursion(treeNode.right);
                if (r[0] == 1 && treeNode.val < r[1]) {
                    isBST = 1;
                    min = treeNode.val;
                    max = r[2];
                    sum += treeNode.val + r[3];
                }
            }
            if (isBST == 1) {
                res = Math.max(res, sum);
            }
            return new int[]{isBST, min, max, sum};
        }
    }
}
