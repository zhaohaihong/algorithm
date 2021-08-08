package Greedy;

public class CanPlaceFlowers {
    static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int cnt = 0;
            for (int i = 0; i < flowerbed.length && cnt < n; i++) {
                if (flowerbed[i] == 1) {
                    continue;
                }
                int pre = i == 0 ? 0 : flowerbed[i - 1];
                int last = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
                if (pre == 0 && last == 0) {
                    cnt++;
                    flowerbed[i] = 1;
                }
            }
            return cnt >= n;
        }
    }
}
