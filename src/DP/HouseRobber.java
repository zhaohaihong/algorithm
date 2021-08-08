package DP;

public class HouseRobber {
    static class Solution {
        public int rob(int[] nums) {
            int pre1 = 0;
            int pre2 = 0;
            for (int num : nums) {
                int cur = Math.max(pre1 + num, pre2);
                pre1 = pre2;
                pre2 = cur;
            }
            return pre2;
        }
    }
}
