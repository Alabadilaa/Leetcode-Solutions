package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];
        int len = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key: map.keySet()) {
            int fq = map.get(key);
            if (buckets[fq] == null) {
                buckets[fq] = new ArrayList<>();
            }
            buckets[fq].add(key);
        }

        int[] res = new int[k];
        int count = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int j = 0; j < buckets[i].size() && count < k; j++) {
                    res[count] = buckets[i].get(j);
                    count++;
                }
            }
        }

        return res;
    }
}