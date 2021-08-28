package DP;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquares {
    static class Solution {
        public int numSquares(int n) {
            List<Integer> squaresList = generateSquaresList(n);
            int[] dp = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int min = Integer.MAX_VALUE;
                for (Integer square : squaresList) {
                    if (square > i) {
                        break;
                    }
                    min = Math.min(min, dp[i - square] + 1);
                }
                dp[i] = min;
            }
            return dp[n];
        }

        private List<Integer> generateSquaresList(int n) {
            List<Integer> result = new ArrayList<>();
            int squares = 1;
            int diff = 3;
            while (squares <= n) {
                result.add(squares);
                squares += diff;
                diff += 2;
            }
            return result;
        }
    }
}
