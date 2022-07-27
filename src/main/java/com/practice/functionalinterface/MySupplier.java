package com.practice.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        System.out.println("dbValue:"+returnDatabaseConnection.get());
        System.out.println("dbValueList:"+ returnDatabaseConnectionList.get());
    }

    //Supplier return fix values, can be string, list or any type
    static Supplier<String> returnDatabaseConnection=()-> "jdbc://localhost:1800/users";
    static Supplier<List<String>> returnDatabaseConnectionList=()-> List.of("jdbc://localhost:1800/users","jdbc://localhost:1800/users2");
}
