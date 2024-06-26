package SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int longest = 0;

        for (int i = 0; i < len; i++) {
            int incr = 0;
            int count = 0;

            while (i + incr < len && count <= k) {
                if (s.charAt(i + incr) != s.charAt(i)) {
                    count++;
                }
                if (count <= k) {
                    incr++;
                }
            }

            int leftIncr = 1;

            while (i - leftIncr >= 0 && count <= k) {
                if (s.charAt(i - leftIncr) != s.charAt(i)) {
                    count++;
                }
                if (count <= k) {
                    incr++;
                    leftIncr++;
                }
            }
            longest = Math.max(longest, incr);
        }

        return longest;
    }
}