package org.example.home10;


import org.junit.Assert;
import org.junit.Test;


public class MaxProfitTest {

    private final MaxProfit maxProfit = new MaxProfit();

    @Test
    public void MaxProfitTestPositive() {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = maxProfit.maxProfit(prices);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MaxProfitTestZero() {

        int[] prices = new int[]{7, 6, 5, 3, 2, 1};
        int expected = 0;
        int actual = maxProfit.maxProfit(prices);
        Assert.assertEquals(expected, actual);
    }

}
