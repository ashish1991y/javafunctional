package com.practice.streams;

import com.practice.Main;

import java.util.List;
import java.util.stream.Collectors;

import static com.practice.streams.MyStreams.Gender.FEMALE;
import static com.practice.streams.MyStreams.Gender.MALE;


public class MyStreams {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ashish", MALE),
                new Person("Himisha", FEMALE),
                new Person("Akshda", FEMALE),
                new Person("Nadeem", MALE),
                new Person("Sarvdeep", MALE),
                new Person("Prakhar", MALE)
        );

        //streams
        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean hasFemale = people.stream().anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(hasFemale);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
