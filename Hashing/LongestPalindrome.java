package Hashing;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] charCount = new int[124];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int pal = 0;
        boolean isOdd = false;

        for (int count : charCount) {
            if (count % 2 == 0) {
                pal += count;
            } else {
                pal += count - 1;
                isOdd = true;
            }
        }

        return pal + (isOdd ? 1 : 0);
    }
}