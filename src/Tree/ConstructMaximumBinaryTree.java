package Tree;

import common.TreeNode;

import java.util.Arrays;

public class ConstructMaximumBinaryTree {
    static class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            if (nums.length == 1) {
                return new TreeNode(nums[0]);
            }
            int index = 0;
            int maxNumber = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > maxNumber) {
                    index = i;
                    maxNumber = nums[i];
                }
            }
            TreeNode root = new TreeNode(maxNumber);
            root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
            root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, Math.min(index + 1, nums.length), nums.length));
            return root;
        }
    }
}
