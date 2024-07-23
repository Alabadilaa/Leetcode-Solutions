package StacksAndQueues;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frq = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            frq.put(nums[i], frq.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (frq.get(a) != frq.get(b)) return frq.get(a) - frq.get(b);
            else return b - a;
        });

        for (int num: nums) {
            pq.offer(num);
        }

        int idx = 0;
        while(!pq.isEmpty()) {
            nums[idx++] = pq.poll();
        }

        return nums;
    }
}
