package com.humboldtsltns.calcengine;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Randoms {

    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> surnames = new ArrayList<String>();
    ArrayList<String> letter = new ArrayList<String>();

    public Randoms() {
    }

    public String nameGen() {

        loadFile("forenames.txt", names);

        return names.get(ranNumGen(names.size()-1));
    }

    public String surnameGen() {

        loadFile("surnames.txt", surnames);

        return names.get(ranNumGen(names.size()-1));
    }

    public String letterGen() {

        loadFile("alphabet.txt", letter);

        return letter.get(ranNumGen(letter.size()-1));
    }

    public String postcodeGen() {
        return (letterGen() + letterGen() + (ranNumGen(9)) + (ranNumGen(9)) + " " + (ranNumGen(9)) + letterGen() + letterGen());
    }

    public int ranNumGen(int maxNum) {
        return (int)(Math.random() * maxNum + 1);
    }

    private void loadFile(String fileName, List<String> list) {
        Scanner scanner;
        try{
            scanner = new Scanner(new File(fileName));
            while(scanner.hasNext()) {
                list.add(scanner.next());
            }
        } catch(Exception e) {
            System.out.println(e + ": Could not find file");
        }

    }

    public void saveFile(List<Person> personList, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (Person person : personList) {
                fileWriter.write("First name: " + person.firstName + "\nSurname: " + person.surname + "\nAge: " + person.age + "\nPostcode: " + person.postcode + "\n-------------\n");
            }
            System.out.println("File created");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not created");
        }
    }

    public void saveFile(Set<Person> personList, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (Person person : personList) {
                fileWriter.write("First name: " + person.firstName + "\nSurname: " + person.surname + "\nAge: " + person.age + "\nPostcode: " + person.postcode + "\n-------------\n");
            }
            System.out.println("File created");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not created");
        }
    }

    public void printList(Set<Person> personList) {
        for (Person person : personList) {
            System.out.println("First name: " + person.firstName + "\nSurname: " + person.surname + "\nAge: " + person.age + "\nPostcode: " + person.postcode + "\n");
        }
    }

    public void printList(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("First name: " + person.firstName + "\nSurname: " + person.surname + "\nAge: " + person.age + "\nPostcode: " + person.postcode + "\n");
        }
    }

}
