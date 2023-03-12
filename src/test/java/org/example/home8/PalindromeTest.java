package org.example.home8;


import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    public void palindromeTest(){

        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean actual = palindrome.checkPalindrome(s);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void palindromeIfEmptyTest(){

        String s = " ";
        boolean expected = true;
        boolean actual = palindrome.checkPalindrome(s);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void palindromeIfNotTest(){

        String s = "race a car";
        boolean expected = false;
        boolean actual = palindrome.checkPalindrome(s);
        Assert.assertEquals(expected, actual);
    }


}
