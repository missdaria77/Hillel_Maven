package org.example.home10;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int finalRes = 0;
        if (prices.length > 1) {
            int buy = prices[0];
            int sell = prices[1];
            int i = 1;
            finalRes = sell - buy;
            while (i < prices.length) {
                if (sell < prices[i]) {
                    sell = prices[i];
                }
                if (buy > prices[i]) {
                    if (i < prices.length - 1) {
                        buy = prices[i];
                        sell = prices[i];
                    }
                }
                if (finalRes < sell - buy) {
                    finalRes = sell - buy;
                }
                i++;
            }

        }
        if (finalRes < 0) {
            return 0;
        }

        return finalRes;
    }

/*
    public int timeToBuy(int[] prices) {

        Map<Integer, int[]> res = new HashMap<>();
        int finalRes = 0;
        if (prices.length > 1) {
            System.out.println(Arrays.toString(prices));

            for (int j = 0; j < prices.length; j++) {
                for (int i = j + 1; i < prices.length; i++) {
                    var profit = Math.max(prices[i] - prices[j], 0);
                    res.put(profit, new int[]{j, i});
                    finalRes = Collections.max(res.keySet());
                }
            }
        }
        //     System.out.println(res.get(Collections.max(res.keySet())));
        return finalRes;
    }
 */
}
