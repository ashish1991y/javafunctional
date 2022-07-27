package com.practice.functionalinterface;

import com.practice.Main;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.practice.functionalinterface.MyConsumer.Person.Gender.FEMALE;
import static com.practice.functionalinterface.MyConsumer.Person.Gender.MALE;

public class MyConsumer {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ashish", MALE),
                new Person("Himisha", FEMALE),
                new Person("Akshda", FEMALE),
                new Person("Nadeem", MALE),
                new Person("Sarvdeep", MALE),
                new Person("Prakhar", MALE)
        );
        displayCustomerData(people.get(0));
        displayCustomer.accept(people.get(2));
        showCustomerData.accept(people.get(3),false);
        showCustomerData.accept(people.get(3),true);
    }

    static void displayCustomerData(Person person) {
        System.out.println("Hello:"+person.name+", Gender:" +person.gender);
    }

    static Consumer<Person> displayCustomer = person -> System.out.println("Hello:"+person.name+", Gender:" +person.gender);

    static BiConsumer<Person,Boolean> showCustomerData= (person,showGender) -> System.out.println("Hello:"+person.name +", Gender:"
            +(showGender?person.gender:"*****"));

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        enum Gender {
            MALE, FEMALE
        }
    }
}
