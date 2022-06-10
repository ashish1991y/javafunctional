package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.practice.Main.Gender.FEMALE;
import static com.practice.Main.Gender.MALE;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ){

        List<Person> people = List.of(
                new Person("Ashish",MALE),
                new Person("Himisha",FEMALE),
                new Person("Akshda",FEMALE),
                new Person("Nadeem",MALE),
                new Person("Sarvdeep",MALE),
                new Person("Prakhar",MALE)
                );

        //Imperative approach
        System.out.println("Imperative approach");
        List<Person> males = new ArrayList<>();
        for(Person person:people){
            if(MALE.equals(person.gender)){
                males.add(person);
            }
        }
        for(Person male:males){
            System.out.println(male);
        }

        //Declarative approach
        System.out.println("Declarative approach");

        //only print the list
        people.stream().filter(person->MALE.equals(person.gender))
                .forEach(System.out::println);
        //collect the male object
       List<Person> male= people.stream().filter(person->MALE.equals(person.gender))
                .collect(Collectors.toList());
    }

    static class Person{
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
    enum Gender{
        MALE,FEMALE
    }
}
