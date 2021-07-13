package Tree.BST;

public class UniqueBST {
    static class Solution {
        int[][] memo;

        public int numTrees(int n) {
            memo = new int[n + 1][n + 1];
            return count(1, n);
        }

        public int count(int low, int hi) {
            if (low > hi) {
                return 1;
            }
            if (memo[low][hi] != 0) {
                return memo[low][hi];
            }
            int res = 0;
            for (int i = low; i <= hi; i++) {
                int leftCount = count(low, i - 1);
                int rightCount = count(i + 1, hi);
                res += leftCount * rightCount;
            }
            memo[low][hi] = res;
            return res;
        }
    }
}
