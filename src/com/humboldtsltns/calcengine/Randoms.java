package com.humboldtsltns.calcengine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Randoms {

    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> surnames = new ArrayList<String>();
    ArrayList<String> letter = new ArrayList<String>();

    public Randoms() {

    }

    //Gens
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

}
