package Tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            while (cur != null || !stack.isEmpty()) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                TreeNode temp = stack.pop();
                result.add(temp.val);
                cur = temp.right;
            }
            return result;
        }
    }
}
