
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < len; i++) {
            profit = Math.max(prices[i] - min, profit);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
