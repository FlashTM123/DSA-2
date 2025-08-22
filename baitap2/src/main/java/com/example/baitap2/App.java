package com.example.baitap2;

public class App {
    public static void main(String[] args) {
         Manager manager = new Manager();
        Products product1 = new Products(1, "Laptop", 1500.0);
        Products product2 = new Products(2, "Smartphone", 800.0);
        manager.addProduct(product1);
        manager.addProduct(product2);
        
        manager.displayAllProducts();
        manager.updatePrice(1, 1400.0);
        manager.displayAllProducts();
    }
}
