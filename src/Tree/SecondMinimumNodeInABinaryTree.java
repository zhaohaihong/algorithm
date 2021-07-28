package Tree;

import common.TreeNode;

public class SecondMinimumNodeInABinaryTree {
    static class Solution {
        public int findSecondMinimumValue(TreeNode root) {
            if (root == null || root.left == null) {
                return -1;
            }
            int leftVal = root.left.val;
            int rightVal = root.right.val;
            if (leftVal == root.val) {
                leftVal = findSecondMinimumValue(root.left);
            }
            if (rightVal == root.val) {
                rightVal = findSecondMinimumValue(root.right);
            }
            if (leftVal != -1 && rightVal != -1) {
                return Math.min(leftVal, rightVal);
            }
            if (leftVal != -1) {
                return leftVal;
            }
            return rightVal;
        }
    }
}
