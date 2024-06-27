package Hashing;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public List<String> commonChars(String[] words) {
        int[] occ = new int[26];
        List<String> res = new ArrayList<>();

        for (char h : words[0].toCharArray()) {
            occ[h - 'a']++;
        }

        for (int j = 1; j < words.length; j++) {
            int[] temp = new int[26];
            for (char c : words[j].toCharArray()) {
                temp[c - 'a']++;
            }
          
            for (int i = 0; i < 26; i++) {
                occ[i] = Math.min(occ[i], temp[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            for (int count = 0; count < occ[i]; count++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }

        return res;
    }
}

