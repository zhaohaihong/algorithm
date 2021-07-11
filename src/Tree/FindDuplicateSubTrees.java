package Tree;

import common.TreeNode;

import java.util.*;

public class FindDuplicateSubTrees {
    static class Solution {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> result = new ArrayList<>();

        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            getStrOfNode(root);
            return result;
        }

        public String getStrOfNode(TreeNode treeNode) {
            if (treeNode == null) {
                return "#";
            }
            String leftStr = getStrOfNode(treeNode.left);
            String rightStr = getStrOfNode(treeNode.right);
            String currentStr = leftStr + "," + rightStr + "," + treeNode.val;
            int count = map.getOrDefault(currentStr, 0);
            if (count == 1) {
                result.add(treeNode);
            }
            map.put(currentStr, count + 1);
            return currentStr;
        }
    }
}
