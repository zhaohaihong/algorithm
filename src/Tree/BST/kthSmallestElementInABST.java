package Tree.BST;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class kthSmallestElementInABST {
    static class Solution {
        List<Integer> list = new ArrayList<>();

        public int kthSmallest(TreeNode root, int k) {
            addList(root);
            return list.get(k - 1);
        }

        public void addList(TreeNode treeNode) {
            if (treeNode == null) {
                return;
            }
            addList(treeNode.left);
            list.add(treeNode.val);
            addList(treeNode.right);
        }
    }
}
