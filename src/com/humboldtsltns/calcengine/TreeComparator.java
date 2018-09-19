package com.humboldtsltns.calcengine;

import java.util.Comparator;

public class TreeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int comparitor = (o1.postcode.compareTo(o2.postcode));
        if (comparitor > 0) return 1;
        if (comparitor < 0) return -1;
        return 0;
    }
}
