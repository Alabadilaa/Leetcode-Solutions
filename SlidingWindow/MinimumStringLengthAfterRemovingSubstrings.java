package SlidingWindow;

public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            if (s.contains("AB")) s = s.replace("AB", "");
            else s = s.replace("CD", "");
        }

        return s.length();
    }
}
