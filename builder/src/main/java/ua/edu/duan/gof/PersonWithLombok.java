package ua.edu.duan.gof;

import lombok.Builder;

import java.util.Objects;
import java.util.Set;

@Builder
public class PersonWithLombok {
    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int weight;
    private final Set<Person> parents;


    public void printPerson() {
        System.out.println("PERSON");
        if (Objects.nonNull(name)) {
            System.out.println("name: " + name);
        }
        if (Objects.nonNull(surname)) {
            System.out.println("surname: " + surname);
        }
        if (age != 0) {
            System.out.println("age: " + age);
        }
        if (height != 0) {
            System.out.println("height: " + height);
        }
        if (weight !=0) {
            System.out.println("weight: " + weight);
        }
        if (Objects.nonNull(parents)) {
            System.out.println("PARENTS");
            parents.stream().forEach(Person::printPerson);
        }
    }

}
