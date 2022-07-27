package com.practice.functionalinterface;

import java.util.function.Predicate;

public class MyPredicate {

    public static void main(String[] args) {

        //predicate call
        System.out.println("phone Number +90123476800:" + isValidPhoneNumber.test("+90123476800"));
        System.out.println("phone Number +901234768001:" + isValidPhoneNumber.test("+901234768000"));
        System.out.println("phone Number +80123476800:" + isValidPhoneNumber.test("+80123476800"));
        System.out.println("phone Number +91123476800:" + isValidPhoneNumber.and(startWithCountryCode).test("+91123476800"));
    }

    //predicate : allow one value and return boolean
    static Predicate<String> isValidPhoneNumber = (phoneNumber) -> (phoneNumber.startsWith("+9") && phoneNumber.length() == 12);
    static Predicate<String> startWithCountryCode = phoneNumber -> phoneNumber.startsWith("+91");

    //BiPredicate : allow two value and return boolean
}
