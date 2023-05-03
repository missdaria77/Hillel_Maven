package org.example.basic.home18;


import org.junit.Assert;
import org.junit.Test;

public class RomanToIntTest {
    private final RomanToInt romanToInt = new RomanToInt();

    @Test
    public void romanToIntTest() {
        String input = "XXVI";
        int expected = 26;
        int actual = RomanToInt.romanToInt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romanToIntComplexTest() {
        String input = "MMMXCV";
        int expected = 3095;
        int actual = RomanToInt.romanToInt(input);
        Assert.assertEquals(expected, actual);
    }

}
