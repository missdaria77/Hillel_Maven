package org.example.home8;

import java.util.Arrays;

public class DuplicatesFinder {

    public Boolean checkDuplicates(int[] input) {
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        int k = input[0];
        for (int i = 1; i < input.length; i++) {
            if (k < input[i]) {
                k = input[i];
            } else {
                return true;
            }
        }
        return false;
    }
}
