package Tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AveragesOfLevelsInBinaryTree {
    static class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            if (root == null) {
                return new ArrayList<Double>();
            }
            List<Double> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int cnt = queue.size();
                double sum = 0;
                for (int i = 0; i < cnt; i++) {
                    TreeNode treeNode = queue.poll();
                    sum += treeNode.val;
                    if (treeNode.left != null) {
                        queue.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        queue.add(treeNode.right);
                    }
                }
                res.add(sum / cnt);
            }
            return res;
        }
    }
}
