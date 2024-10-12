package StacksAndQueues;

import java.util.Arrays;
import java.util.PriorityQueue;

public class IntervalsIntoMinGroups {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (minheap.peek() < intervals[i][0]) {
                minheap.poll();
            } 
            minheap.add(intervals[i][1]);
        }

        return minheap.size();
    }
}
