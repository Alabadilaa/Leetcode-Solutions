package StacksAndQueues;

import java.util.LinkedList;

public class WinnerCircularGame {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> q = new LinkedList<>();
        int count = 1;

        for (int i = 0; i < n; i++) q.offer(i+1);

        while(q.size() > 1) {
            if (count % k == 0) {
                q.poll();
                count = 1;
            } else {
                q.offer(q.poll());
                count++;
            }
        }

        return q.poll();
    }
}
