package com.humboldtsltns.calcengine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main (String[] args) {
        ArrayList<Person> personArray = new ArrayList<>();
        Randoms randoms = new Randoms();
        for (int i = 0; i < 150; i++) {
            Person person = new Person(randoms.nameGen(), randoms.surnameGen(), randoms.ranNumGen(100), randoms.postcodeGen());
            personArray.add(person);
        }

        //Collections.sort(personArray);
        Collections.sort(personArray, new ExternalComparator());
        TreeSet<Person> personTreeSet = new TreeSet<>(personArray);
        Set<Person> personTreeSorted = new TreeSet<>(new TreeComparator());

        personTreeSorted.addAll(personArray);

        //Prints
        for (Person person : personArray) {

        }

        for (Person person : personTreeSet) {

        }

        for (Person person : personTreeSorted) {
            System.out.println("First name: " + person.firstName + "\nSurname: " + person.surname + "\nAge: " + person.age + "\nPostcode: " + person.postcode + "\n");
        }

        randoms.saveFile(personArray, "ArrayOutput.txt");

    }

}
