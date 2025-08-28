package com.example.lythuyet;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        // Nếu o1 > o2 thì trả về 1
        // Nếu o1 < o2 thì trả về 0
        // Nếu o1 < o2 thì trả về -1
        return Integer.compare(p1.getAge(), p2.getAge());
    }
    
}
