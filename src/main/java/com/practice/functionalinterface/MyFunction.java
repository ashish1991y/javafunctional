package com.practice.functionalinterface;

import java.util.function.BiFunction;
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
        Function<Integer, Integer> resultByTwoFunction = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println("Function: "+resultByTwoFunction.apply(2));

        //call biFunction
        System.out.println("biFunction: " + incrementByOneAndMultiplyBiFunction.apply(2, 100));

        //call biFunction
        System.out.println("biFuntion:" + addBy2Multiply.apply(2,20));
    }


    //traditional  java code
    static int incrementByOne(int number) {
        return number + 1;
    }

    //Function, this allowed one argument  and produces one result
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    //BiFunction, this allowed two argument  and produces one result

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static BiFunction<Integer,Integer,Integer> addBy2Multiply =
            (numberToAdd,numberToMultiply) -> (numberToAdd +2) * numberToMultiply;
}
