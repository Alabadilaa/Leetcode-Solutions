package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatedChars {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len < 2) return len;

        HashSet<Character> seen = new HashSet<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < len; right++) {
            char currentChar = s.charAt(right);

            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(currentChar);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
