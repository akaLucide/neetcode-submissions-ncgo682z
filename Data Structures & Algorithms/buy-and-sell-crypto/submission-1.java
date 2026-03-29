class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int currBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (currBuy > prices[i]) {
                currBuy = prices[i];
            }

            max = Math.max(prices[i] - currBuy, max);
        }

        return max;
    }
}
