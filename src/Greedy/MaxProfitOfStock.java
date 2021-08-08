package Greedy;

public class MaxProfitOfStock {
    static class Solution {
        //        public int maxProfit(int[] prices) {
//            int max = 0;
//            int minVal = prices[0];
//            for (int i = 1; i < prices.length; i++) {
//                if (minVal > prices[i]) {
//                    minVal = prices[i];
//                } else {
//                    max = Math.max(max, prices[i] - minVal);
//                }
//            }
//            return max;
//        }
        public int maxProfit(int[] prices) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] - prices[i - 1] > 0) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
    }
}
