package ua.edu.duan.gof;

import java.util.Objects;
import java.util.Set;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    private Person(){}

    public void printPerson() {
        System.out.println("PERSON");
        if (Objects.nonNull(name)) {
            System.out.println("name: " + name);
        }
        if (Objects.nonNull(surname)) {
            System.out.println("surname: " + surname);
        }
        if (Objects.nonNull(age)) {
            System.out.println("age: " + age);
        }
        if (Objects.nonNull(height)) {
            System.out.println("height: " + height);
        }
        if (Objects.nonNull(weight)) {
            System.out.println("weight: " + weight);
        }
        if (Objects.nonNull(parents)) {
            System.out.println("PARENTS");
            parents.stream().forEach(Person::printPerson);
        }
    }

    public static class Builder { // публічний статичний клас

        private Person newPerson; // екземпляр потрібного класу до створення та наповнення

        public Builder() {
            newPerson = new Person(); // створюємо цільовий екземпляр Person
        }

        public Builder withName(String name) { // сеттер для поля імені зовнішнього класу
            newPerson.name = name;
            return this; // При виклику сеттера - повертаємо поточний екземпляр
        }


        public Builder withSurname(String surname){ // сетер для поля прізвища зовнішнього класу
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age) { // сеттер для поля віку зовнішнього класу
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height) { // сеттер для поля зростання зовнішнього класу
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight) { // сеттер для поля ваги зовнішнього класу
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){ // сеттер для поля батьків зовнішнього класу
            newPerson.parents = parents;
            return this;
        }

        public Person build() { // метод повертає екземпляр зовнішнього класу
            return newPerson;
        }
    }
}