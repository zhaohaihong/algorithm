package Tree;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class HouseRobberIII {
    static class Solution {
        Map<TreeNode, Integer> result = new HashMap<>();

        public int rob(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (result.containsKey(root)) {
                return result.get(root);
            }
            int val1 = root.val;
            if (root.left != null) {
                val1 += rob(root.left.left) + rob(root.left.right);
            }
            if (root.right != null) {
                val1 += rob(root.right.left) + rob(root.right.right);
            }
            int val2 = rob(root.left) + rob(root.right);
            int res = Math.max(val1, val2);
            result.put(root, res);
            return res;
        }
    }
}
