package Hashing;

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanDict = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int len = s.length();
        int result = romanDict.get(s.charAt(len - 1));

        for (int i = len - 2; i >= 0; i--) {
            int currentNum = romanDict.get(s.charAt(i));
            int nextNum = romanDict.get(s.charAt(i + 1));

            if (currentNum < nextNum) {
                result -= currentNum;
            } else {
                result += currentNum;
            }
        }

        return result;
    }
}