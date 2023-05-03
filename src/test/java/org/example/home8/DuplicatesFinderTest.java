package org.example.home8;
import org.junit.Assert;
import org.junit.Test;

public class DuplicatesFinderTest {

    private final DuplicatesFinder duplicatesFinder = new DuplicatesFinder();

    @Test
    public void checkDuplicatesTest() {
        int[] input = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expected = true;
        boolean actual = duplicatesFinder.checkDuplicates(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkDuplicatesIfNotTest() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        boolean expected = false;
        boolean actual = duplicatesFinder.checkDuplicates(input);
        Assert.assertEquals(expected, actual);
    }

}
