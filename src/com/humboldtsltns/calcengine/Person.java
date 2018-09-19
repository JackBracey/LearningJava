package com.humboldtsltns.calcengine;

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
        int compareInt = this.surname.compareTo(o.surname);
        if (compareInt > 0) return 1;
        if (compareInt < 0) return -1;
        return 0;
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

    //@Override
    //public int hashCode() {
    //    return Objects.hash(firstName, surname, age, postcode);
    //}