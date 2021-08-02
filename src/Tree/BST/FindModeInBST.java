package Tree.BST;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindModeInBST {
    static class Solution {
        private int curCount = 1;

        private int maxCount = 1;

        private TreeNode preNode = null;

        public int[] findMode(TreeNode root) {
            List<TreeNode> list = new ArrayList<>();
            inOrder(root, list);
            int[] res = new int[list.size()];
            int index = 0;
            for (TreeNode treeNode : list) {
                res[index++] = treeNode.val;
            }
            return res;
        }

        public void inOrder(TreeNode treeNode, List<TreeNode> list) {
            if (treeNode == null) {
                return;
            }
            inOrder(treeNode.left, list);
            if (preNode != null) {
                if (preNode.val == treeNode.val) {
                    curCount++;
                } else {
                    curCount = 1;
                }
            }
            if (curCount > maxCount) {
                maxCount = curCount;
                list.clear();
                list.add(treeNode);
            } else if (curCount == maxCount) {
                list.add(treeNode);
            }
            preNode = treeNode;
            inOrder(treeNode.right, list);
        }
    }
}
