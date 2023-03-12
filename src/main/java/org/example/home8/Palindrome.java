package org.example.home8;

public class Palindrome {
    public Boolean checkPalindrome(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rInput = String.valueOf(new StringBuilder(input).reverse());
        return input.equals(rInput);
    }
}
