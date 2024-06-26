package StacksAndQueues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if (k == 0) return w;
        int len = profits.length;
        
        Queue<int[]> caps = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        Queue<int[]> possible = new PriorityQueue<>((a, b) -> b[1] - a [1]);

        for (int i = 0; i < len; i ++) {
            caps.offer(new int[] {capital[i], profits[i]});
        }

        while (k > 0) {
            while (!caps.isEmpty() && caps.peek()[0] <= w) {
                possible.offer(caps.poll());
            }

            if (possible.isEmpty()) break;

            w += possible.poll()[1];
            k--;
        }

        return w;
    }
}


