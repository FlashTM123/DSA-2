package com.example.baitap6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", 1500.0),
                new Product("P002", "Smartphone", 800.0),
                new Product("P003", "Tablet", 600.0),
        };
        // In mảng product ban đầu khi chưa sắp xếp
        System.out.println(Arrays.toString(products));
        // Sắp xếp với Arrays.sort() và PriceComparator
        Arrays.sort(products, new PriceComparator());
        System.out.println(Arrays.toString(products));

        Arrays.sort(products, new NameComparator());
        // In mảng product sau khi sắp xếp
        System.out.println(Arrays.toString(products));
    }
}
