package com.humboldtsltns.calcengine;

import java.util.Objects;

public class Person implements Comparable<Person> {

    String firstName;
    String surname;
    int age;
    String postcode;

    public Person(String firstName, String surname, int age, String postcode) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.postcode = postcode;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(postcode, person.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, age, postcode);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

}
