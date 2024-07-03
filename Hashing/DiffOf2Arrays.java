package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiffOf2Arrays {
    class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> dups = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        Set<Integer> distinct1 = new HashSet<>();
        for (int num : nums1) {
            distinct1.add(num);
        }
        Set<Integer> distinct2 = new HashSet<>();
        for (int num : nums2) {
            distinct2.add(num);
        }

        int[] dist1 = distinct1.stream().mapToInt(Integer::intValue).toArray();
        int[] dist2 = distinct2.stream().mapToInt(Integer::intValue).toArray();

        int len1 = dist1.length;
        int len2 = dist2.length;


        for (int i = 0; i < len1; i++) {
            dups.put(dist1[i], 1);
        }

        for (int j = 0; j < len2; j++) {
            if (dups.containsKey(dist2[j])) {
                dups.put(dist2[j], 0);
            } else {
                dups.put(dist2[j], 2);
            }
        }

        for (int key : dups.keySet()) {
            if (dups.get(key) == 1) {
                first.add(key);
            } else if (dups.get(key) == 2) {
                second.add(key);
            }
        }
        answer.add(first);
        answer.add(second);
        return answer;
    }
}
}
