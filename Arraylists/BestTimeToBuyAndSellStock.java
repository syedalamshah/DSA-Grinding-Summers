public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // minimum price so far
        int maxProfit = 0;                // maximum profit so far

        for (int i = 0; i < prices.length; i++) {
            // if current price is less than minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // profit if we sell today
            int profit = prices[i] - minPrice;

            // update maxProfit if profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}
