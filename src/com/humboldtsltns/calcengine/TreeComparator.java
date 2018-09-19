package com.humboldtsltns.calcengine;

import java.util.Comparator;

public class TreeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int comparator = (o2.postcode.compareTo(o1.postcode));
        if (comparator > 0) return 1;
        if (comparator < 0) return -1;
        return 0;
    }
}
