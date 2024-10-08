package Greedy;

public class MinSwapsMakeStringBalanced {
    public int minSwaps(String s) {
        int open = 0;
        int closed = 0;
        int swap = 0;
        if (s.length() == 0) return 0;

        for (char c: s.toCharArray()) {
            if (c == '[') open++;
            else closed++;

            if (closed > open) {
                swap++;
                closed--;
                open++;
            }
        }

        return swap;
    }
}
