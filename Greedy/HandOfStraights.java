package Greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if (len % groupSize != 0) return false;

        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : hand) {
            if (map.get(num) == 0) continue;

            for (int i = 0; i < groupSize; i++) {
                int current = num + i;
                if (map.getOrDefault(current, 0) == 0) return false;
                map.put(current, map.get(current) - 1);
            }
        }

        return true;
    }
}

