package org.example.home18;

import java.util.*;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<String, Integer> values = Map.of("I", 1, "V", 5, "X", 10, "L", 50,
                "C", 100, "D", 500, "M", 1000);

        ArrayList<String> input = new ArrayList<>(Arrays.asList(s.split("")));

        int res = 0;
        for (int i = 0; i < input.size(); i++) {
            if (i != input.size() - 1) {
                if (values.get(input.get(i)) < values.get(input.get(i + 1))) {
                    res = res + values.get(input.get(i + 1)) - values.get(input.get(i));
                    i++;
                } else {
                    res = res + values.get(input.get(i));
                }
            } else {
                res = res + values.get(input.get(i));
            }
        }
        return res;

    }

}
