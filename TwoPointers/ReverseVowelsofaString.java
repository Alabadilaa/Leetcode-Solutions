package TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        List<Character> vow = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.contains(ch)) {
                vow.add(ch);
                idx.add(i);
            }
        }


        for (int j = vow.size() - 1; j >= 0; j--) {
            char ch = vow.get(j);
            int index = idx.get(vow.size() - 1 - j);
            s = s.substring(0, index) + ch + s.substring(index + 1);
        }
        return s;
    }
} 
