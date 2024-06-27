package Hashing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoCloseStrings {
    public boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 != len2) {
            return false;
        }

        Map<Character, Integer> occur1 = new HashMap<>();
        Map<Character, Integer> occur2 = new HashMap<>();

        for (char c: word1.toCharArray()) {
            if (!occur1.containsKey(c)) {
                occur1.put(c, 1);
            } else {
                int count = occur1.get(c) + 1;
                occur1.put(c, count);
            }
        }
        for (char c: word2.toCharArray()) {
            if (!occur2.containsKey(c)) {
                occur2.put(c, 1);
            } else {
                int count = occur2.get(c) + 1;
                occur2.put(c, count);
            }
        }
        Set<Character> keySet1 = occur1.keySet();
        Set<Character> keySet2 = occur2.keySet();

        Collection<Integer> values1 = occur1.values();
        Collection<Integer> values2 = occur2.values();

        List<Integer> list1 = new ArrayList<>(values1);
        List<Integer> list2 = new ArrayList<>(values2);

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2) && keySet1.equals(keySet2);

    }
}
