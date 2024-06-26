package BinarySearch;

import java.util.Arrays;

public class MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int len = difficulty.length;
        int[][] jobs = new int[len][2];

        for (int i = 0; i < len; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        
        int j = 0;
        int sum = 0;
        int maxProfit = 0;

        for (int power: worker) {
            while (j < len && jobs[j][0] <= power) {
                maxProfit = Math.max(maxProfit, jobs[j][1]);
                j++;
            }
            sum += maxProfit;
        }
        return sum;
    }
}

