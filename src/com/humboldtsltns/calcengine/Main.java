package com.humboldtsltns.calcengine;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.out;

public class Main {

    public static void main (String[] args) {

        ArrayList<Person> personArray = new ArrayList<Person>();
        Randoms randoms = new Randoms();

        for (int i = 0; i < 1000; i++) {
            Person person = new Person(randoms.nameGen(), randoms.surnameGen(), (randoms.ranNumGen(100)), randoms.postcodeGen());
            personArray.add(person);
        }

        HashSet<Person> personHashSet = new HashSet<Person>(personArray);

        for (Person people : personHashSet) {
            out.println("First name: " + people.firstName + "\nSurname: " + people.surname + "\nAge: " + people.age + "\nPostcode: " + people.postcode + "\n---------------");
        }

        out.println("----TreeSet----");

        Set<Person> personTreeSet = new TreeSet<Person>(personHashSet);
        personTreeSet.addAll(personHashSet);

        for(Person people : personHashSet) {
            out.println("First name: " + people.firstName + "\nSurname: " + people.surname + "\nAge: " + people.age + "\nPostcode: " + people.postcode + "\n---------------");
        }

        try (PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\Humboldt\\IdeaProjects\\HeadFirstJava\\output.txt"))) {
            for (int i = 0; i < personArray.size(); i++) {
                out.print("First name: " + personArray.get(i).firstName + "\nSurname: " + personArray.get(i).surname + "\nAge: " + personArray.get(i).age +
                        "\nPostcode: " + personArray.get(i).postcode + "\n--------------\n");
            }
            System.out.print("File created.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
