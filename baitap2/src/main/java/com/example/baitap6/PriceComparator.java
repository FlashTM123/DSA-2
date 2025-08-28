package com.example.baitap6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }

    // public String compareName(Product p1, Product p2) {
    //     return String.compare(p1.getName(), p2.getName()) > 0 ? p1.getName() : p2.getName();
    // }
}
