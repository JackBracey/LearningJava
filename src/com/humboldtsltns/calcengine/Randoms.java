package com.humboldtsltns.calcengine;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Randoms {

    private Scanner scanner;

    public int ranNumGen(int maxNum) {
        return (int)(Math.random() * maxNum + 1);
    }

    public String nameGen() {

        ArrayList<String> names = new ArrayList<String>();

        try{
            scanner = new Scanner(new File("forenames.txt"));
        } catch(Exception e) {
            System.out.println(e + ": Could not find file");
        }

        while(scanner.hasNext()) {
            names.add(scanner.next());
        }

        return names.get(ranNumGen(names.size()-1));
    }

    public String surnameGen() {
        ArrayList<String> names = new ArrayList<String>();

        try{
            scanner = new Scanner(new File("surnames.txt"));
        } catch(Exception e) {
            System.out.println(e + ": Could not find file");
        }

        while(scanner.hasNext()) {
            names.add(scanner.next());
        }

        return names.get(ranNumGen(names.size()-1));
    }

    public String letterGen() {
        ArrayList<String> letter = new ArrayList<String>();

        try{
            scanner = new Scanner(new File("alphabet.txt"));
        } catch(Exception e) {
            System.out.println(e + ": Could not find file");
        }

        while(scanner.hasNext()) {
            letter.add(scanner.next());
        }

        return letter.get(ranNumGen(letter.size()-1));
    }

    public String postcodeGen() {
        return (letterGen() + letterGen() + (ranNumGen(9)) + (ranNumGen(9)) + " " + (ranNumGen(9)) + letterGen() + letterGen());
    }

}
