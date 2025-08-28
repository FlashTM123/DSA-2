package com.example.lythuyet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("An", 19),
            new Person("Ngọc", 35),
            new Person("Khánh", 29),
        };
        // In mảng person ban đầu khi chưa sắp xếp
        System.out.println(Arrays.toString(persons));
        // Sắp xếp với Arrays.sort() và AgeComparator
        Arrays.sort(persons, new AgeComparator());
        // In mảng person sau khi sắp xếp
        System.out.println(Arrays.toString(persons));
    }
}
