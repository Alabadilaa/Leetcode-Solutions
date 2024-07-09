package Math;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double w = 0;
        int time = 0;

        for (int[] customer: customers) {
            if (customer[0] > time) {
                time = customer[0];
            }
            time += customer[1];
            w += time - customer[0];
        }

        return w / customers.length;
    }
}
