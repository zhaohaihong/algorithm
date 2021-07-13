package Tree.BST;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBSTPart2 {
    static class Solution {
        public List<TreeNode> generateTrees(int n) {
            if (n == 0) {
                return new ArrayList<>();
            }
            return build(1, n);
        }

        public List<TreeNode> build(int low, int high) {
            List<TreeNode> list = new ArrayList<>();
            if (low > high) {
                list.add(null);
                return list;
            }
            for (int i = low; i <= high; i++) {
                List<TreeNode> leftTree = build(low, i - 1);
                List<TreeNode> rightTree = build(i + 1, high);
                for (TreeNode leftNode : leftTree) {
                    for (TreeNode rightNode : rightTree) {
                        TreeNode root = new TreeNode(i);
                        root.left = leftNode;
                        root.right = rightNode;
                        list.add(root);
                    }
                }
            }
            return list;
        }
    }
}
