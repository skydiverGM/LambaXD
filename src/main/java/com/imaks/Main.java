package com.imaks;


//..........1..............................................................................
@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}
//..........3..............................................................................
@FunctionalInterface
interface StringManipulator{
    String manipulate(String s);
}
public class Main {
    //..........3..............................................................................
    private static String strConvert(String s, StringManipulator stringManipulator){
        return stringManipulator.manipulate(s);
    }//as a method
    //or...
    private static StringManipulator strConverted = String::toUpperCase;//as a variable

    public static void main(String[] args) {
        //..........2...................................................................
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        //..........3...................................................................
        System.out.println(strConvert("Hillel", String::toUpperCase));//method
        System.out.println(strConverted.manipulate("Hillel"));//variable

    }
}