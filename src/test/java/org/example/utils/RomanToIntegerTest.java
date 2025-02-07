package org.example.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToIntegerTest {

    /**
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     */
    public int calculate(String s){
        int rsp = 0;

        for (int i = 0; i < s.length(); i++){
            int iAux = i;
            iAux++;
            char c = s.charAt(i);
            int value = getRomanAlphabetValue(c);
            try {
                if (
                    (s.charAt(i) == 'I' && (s.charAt(iAux) == 'V' || s.charAt(iAux) == 'X')) ||
                    (s.charAt(i) == 'X' && (s.charAt(iAux) == 'L' || s.charAt(iAux) == 'C')) ||
                    (s.charAt(i) == 'C' && (s.charAt(iAux) == 'D' || s.charAt(iAux) == 'M'))
                    ){
                    value = value * -1;
                }
            } catch(Exception e){

            }
            rsp += value;
        }

        return rsp;
    }

    private int getRomanAlphabetValue(char c){
        LinkedHashMap<Character, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        return romanMap.get(c);
    }

    @Test
    public void example1(){
        String inputMocked = "III";
        int outputExpected = 3;

        int output = calculate(inputMocked);

        Assert.assertEquals(outputExpected, output);

    }

    @Test
    public void example2(){
        String inputMocked = "LVIII";
        int outputExpected = 58;

        int output = calculate(inputMocked);

        Assert.assertEquals(outputExpected, output);

    }

    @Test
    public void example3(){
        String inputMocked = "MCMXCIV";
        int outputExpected = 1994;

        int output = calculate(inputMocked);

        Assert.assertEquals(outputExpected, output);

    }

}
