package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        int len = strs.length;

        for (int i = 0; i < len; i++) {
            char[] elem = strs[i].toCharArray();
            Arrays.sort(elem);
            String str = new String(elem);

            if (!res.containsKey(str)) {
                res.put(str, new ArrayList<>());
            }
            res.get(str).add(strs[i]);
        }

        return new ArrayList<>(res.values());
    }
}
