package org.example.home8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumFinderTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    public void TwoSumTest() {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        int[] actual = twoSum.twoSum(nums, target);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void TwoSumSameNeighborsTest() {

        int[] nums = new int[]{2, 5, 5, 11};
        int target = 10;
        int[] expected = new int[]{1, 2};
        int[] actual = twoSum.twoSum(nums, target);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
