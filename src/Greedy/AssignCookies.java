package Greedy;

import java.util.Arrays;

public class AssignCookies {
    static class Solution {
        public int findContentChildren(int[] g, int[] s) {
            if (g.length == 0 || s.length == 0) {
                return 0;
            }
            Arrays.sort(g);
            Arrays.sort(s);
            int gi = 0;
            int si = 0;
            while (gi < g.length && si < s.length) {
                if (g[gi] <= s[si]) {
                    gi++;
                }
                si++;
            }
            return gi;
        }
    }
}
