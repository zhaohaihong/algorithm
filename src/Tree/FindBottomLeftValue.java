package Tree;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {
    static class Solution {
        public int findBottomLeftValue(TreeNode root) {
            if (root.left == null && root.right == null) {
                return root.val;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int res = -Integer.MAX_VALUE;
            while (!queue.isEmpty()) {
                int cnt = queue.size();
                for (int i = 0; i < cnt; i++) {
                    TreeNode treeNode = queue.poll();
                    if (i == 0) {
                        res = treeNode.val;
                    }
                    if (treeNode.left != null) {
                        queue.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        queue.add(treeNode.right);
                    }
                }
            }
            return res;
        }
    }
}
