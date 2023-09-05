package ua.edu.duan.gof;

import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        Person dad = new Person.Builder()
                .withName("Bill")
                .withSurname("Jobs")
                .withAge(70)
                .withHeight(165)
                .withWeight(70)
                .build();
        dad.printPerson();
        System.out.println();
        Person myPerson = new Person.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .withParents(Collections.singleton(dad))
                .build();

        myPerson.printPerson();

        PersonWithLombok personWithLombok =
                PersonWithLombok.builder()
                        .name("John")
                        .surname("Snow")
                        .age(70)
                        .build();

        personWithLombok.printPerson();
    }
}
