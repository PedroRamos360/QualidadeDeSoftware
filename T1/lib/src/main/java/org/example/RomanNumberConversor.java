package org.example;

import java.util.HashMap;

public class RomanNumberConversor {
    private static HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int fromRoman(String roman) {
        int result = 0;
        int lastValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanValues.get(roman.charAt(i));
            int multiplier = 1;
            if (value < lastValue) multiplier = -1;
            result += value * multiplier;
            lastValue = value;
        }
        return result;
    }
    
}
