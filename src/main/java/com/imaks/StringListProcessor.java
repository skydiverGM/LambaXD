package com.imaks;

import java.util.function.Function;
//..........4..............................................................................
public class StringListProcessor {
    public static int countUppercase(String s){
        int count = 0;
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
    //..........5..............................................................................
    private static int count(Function<String, Integer> func, String s){
        return func.apply(s);
    }
    public static void main(String[] args) {
        Function<String,Integer> uppercaseCounter = StringListProcessor::countUppercase;

        System.out.println("Number of uppercase characters: "
                + count(uppercaseCounter, "Hello Vladyslav From Hillel!"));
    }
}
