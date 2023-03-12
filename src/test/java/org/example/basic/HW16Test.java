package org.example.basic;


import org.junit.Assert;
import org.junit.Test;

public class HW16Test {
    @Test
    public void meanTest(){
        HW16 hw16 = new HW16();
        double[] array = {2.0, 2.5, 3.0, 70.5, 5.0, 7.0};
        double expected = 15.0;
        double actual = hw16.mean(array);
        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void checkSqMatrixTest(){
        HW16 hw16 = new HW16();
        int[][] array = {{1, 2, 3}, {3, 4, 3}, {3, 4, 3}};
        boolean expected = true;
        boolean actual = hw16.checkSqMatrix(array);
        Assert.assertEquals(expected, actual);
    }
}
