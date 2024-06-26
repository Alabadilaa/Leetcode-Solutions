package Hashing;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0;
        int lent = t.length();
        int lens = s.length();

        while (i < lent && j < lens) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            i++;
        }

        return j == lens;
    }
}