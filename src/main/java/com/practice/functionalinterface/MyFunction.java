package com.practice.functionalinterface;

import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
//traditional  java code
        int result = incrementByOne(1);
        System.out.println(result);

        //function call
        int functionResult = incrementByOneFunction.apply(1);
        System.out.println(functionResult);

        //call two function one by one
        Function<Integer,Integer> resultByTwoFunction= incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(resultByTwoFunction.apply(2));
    }


    //traditional  java code
    static int incrementByOne(int number) {
        return number + 1;
    }

    //using java function
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
}
