package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] sorted_n = new String[names.length];
        for (int j = 0; j < names.length; j++) {
            sorted_n[j] = map.get(heights[names.length - 1 - j]);
        }

        return sorted_n;
    }
}
