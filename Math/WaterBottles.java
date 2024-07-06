package Math;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int full = empty / numExchange;
            res += full;
            empty = full + (empty % numExchange);
        }

        return res;
    }
}
