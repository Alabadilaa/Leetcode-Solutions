package Hashing;

public class HighestAltitude {

    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int low = 0;
        int high = 0;

        for (int i = 0; i < len; i++) {
            low += gain[i];
            high = Math.max(low, high);
        }

        return high;
    }
}
