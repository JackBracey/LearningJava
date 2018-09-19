package com.humboldtsltns.calcengine;

import java.util.Comparator;

public class ExternalComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }
}
