package com.example.baitap8;

public class Main {
    public static void main(String[] args) {
        ChuyenBay cb = new ChuyenBay(10, 4);
        cb.displaySeats();
        cb.checkIn(1, 1);
        cb.checkIn(1, 2);
        cb.checkIn(10, 1);
        cb.displaySeats();
        cb.lietKeChoTrong();
    }
}
