package Tree;

import common.TreeNode;

public class PathSumIII {
    static class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return 0;
            }
            return PathSumStartWithRoot(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        }

        public int PathSumStartWithRoot(TreeNode root, int targetSum) {
            if (root == null) {
                return 0;
            }
            int ret = 0;
            if (root.val == targetSum) {
                ret++;
            }
            ret += PathSumStartWithRoot(root.left, targetSum - root.val) + PathSumStartWithRoot(root.right, targetSum - root.val);
            return ret;
        }
    }
}
