package com.humboldtsltns.calcengine;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Randoms {

    private Scanner scanner;
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> surnames = new ArrayList<String>();
    ArrayList<String> letter = new ArrayList<String>();

    //Gens
    public String nameGen() {

        loadFile("forenames.txt");

        while(scanner.hasNext()) {
            names.add(scanner.next());
        }

        return names.get(ranNumGen(names.size()-1));
    }

    public String surnameGen() {

        loadFile("surnames.txt");

        while(scanner.hasNext()) {
            surnames.add(scanner.next());
        }

        return names.get(ranNumGen(names.size()-1));
    }

    public String letterGen() {

        loadFile("alphabet.txt");

        while(scanner.hasNext()) {
            letter.add(scanner.next());
        }

        return letter.get(ranNumGen(letter.size()-1));
    }

    public String postcodeGen() {
        return (letterGen() + letterGen() + (ranNumGen(9)) + (ranNumGen(9)) + " " + (ranNumGen(9)) + letterGen() + letterGen());
    }

    public int ranNumGen(int maxNum) {
        return (int)(Math.random() * maxNum + 1);
    }



    private void loadFile(String fileName) {
        try{
            scanner = new Scanner(new File(fileName));
        } catch(Exception e) {
            System.out.println(e + ": Could not find file");
        }
    }

}
