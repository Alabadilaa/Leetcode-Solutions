package SlidingWindow;

import java.util.Arrays;

public class TotalImportanceOfRoads {
    public long maximumImportance(int n, int[][] roads) {
        int[] counts = new int[n];

        for (int[] road: roads) {
            counts[road[0]]++;
            counts[road[1]]++;
        }

        Arrays.sort(counts);

        long imp = 0;

        for (int i = 0; i < n; i++) {
            imp += (long) counts[i] * (i + 1);
        }

        return imp;
    }
}
