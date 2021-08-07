package Greedy;

import java.util.Arrays;
import java.util.LinkedList;

public class QueueReconstructionByHeight {
    static class Solution {
        public int[][] reconstructQueue(int[][] people) {
            if (people == null || people.length == 0 || people[0].length == 0) {
                return new int[0][0];
            }
            Arrays.sort(people, (o1, o2) -> o2[0] == o1[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
            LinkedList<int[]> list = new LinkedList<>();
            for (int[] i : people) {
                list.add(i[1], i);
            }
            return list.toArray(new int[list.size()][2]);
        }
    }
}
